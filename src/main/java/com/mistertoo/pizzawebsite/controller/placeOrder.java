package com.mistertoo.pizzawebsite.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mistertoo.pizzawebsite.entity.Customer;
import com.mistertoo.pizzawebsite.entity.Order;
import com.mistertoo.pizzawebsite.openfoodfacts.Response;
import com.mistertoo.pizzawebsite.persistence.GenericDao;
import com.mistertoo.pizzawebsite.util.PropertiesLoader;
import com.oracle.wls.shaded.org.apache.regexp.RE;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.*;

//TODO prices/rewards

/**
 * Place order servlet
 */
@WebServlet(
        urlPatterns = {"/placeOrder"}
)

public class placeOrder extends HttpServlet implements PropertiesLoader{
    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     *Order dao.
     */
    GenericDao<Order> orderDao = new GenericDao<>(Order.class);
    /**
     * Customer dao.
     */
    GenericDao<Customer> customerDAO = new GenericDao<>(Customer.class);
    /**
     * openfoodfacts API values in properties file.
     */
    Properties foodProperties;

    @Override
    public void init() throws ServletException {
        super.init();
        loadProperties();
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //Create utilities
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();


        //get form data
        boolean pickup;
        pickup = Objects.equals(req.getParameter("pickup"), "1");
        String address = req.getParameter("address");
        List<String> toppings = new ArrayList<>();

        //get rewards used, requires null check for parseint
        int rewardsUsed;
        if(req.getParameterValues("rewardsUsed") != null){
             rewardsUsed =Integer.parseInt(req.getParameter("rewardsUsed"));
        }else{
            rewardsUsed = 0;
        }

        //create order object vars
        String allToppings = "";
        String size = req.getParameter("size");
        if(req.getParameterValues("toppings") != null) {
            toppings = Arrays.asList(req.getParameterValues("toppings"));
        }
        int calories = 0;
        int price = 0;


        //Get current customer from session
        HttpSession session = req.getSession(false);
        String userName = (String) session.getAttribute("userName");
        Map<String,Object> propertyMap = new HashMap<>();
        propertyMap.put("uName", userName);
        Customer orderCustomer = customerDAO.findByPropertyEqual(propertyMap).get(0);

        //calculate price and pizza dough calories
        Client client = ClientBuilder.newClient();
        int doughCalories = getKcal(foodProperties.getProperty("doughID"),client);
        if(Objects.equals(size, "small")){
            calories += (doughCalories * .75);
            price += 8;
        } else if (Objects.equals(size, "medium")){
            price += 10;
            calories += doughCalories;
        } else if (Objects.equals(size, "large")){
            price += 11;
            calories += (doughCalories * 1.25);
        }

        if(!pickup){
            price += 5;
        }

        //calculate toppings price and toppings database field, and create all toppings field
        for(int i = 0; i<toppings.size();i++){
            allToppings += toppings.get(i) + " ";
            price += 2;
        }

        //rewards calculations
        if(rewardsUsed>0){
            orderCustomer.setRewards(orderCustomer.getRewards() - rewardsUsed);
            session.setAttribute("rewards",orderCustomer.getRewards());
        }

        if(price>= orderCustomer.getToNextReward()){
            orderCustomer.setToNextReward(100);
            orderCustomer.setRewards(orderCustomer.getRewards() + 10);
            session.setAttribute("rewards",orderCustomer.getRewards());
        } else{
            orderCustomer.setToNextReward((int) (orderCustomer.getToNextReward() - price));
        }
        Order newOrder = new Order(size,allToppings,pickup,address,orderCustomer.getID());

        //validate objects before insertion
        try{
            Set<ConstraintViolation<Customer>> customerConstraintViolations = validator.validate(orderCustomer);
            Set<ConstraintViolation<Order>> orderConstraintViolations = validator.validate(newOrder);
            if(customerConstraintViolations.size()>0 || orderConstraintViolations.size() >0){
                throw new Exception("constraints failed to validate when placing order");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        //insert order and customer
        orderDao.insert(newOrder);
        customerDAO.saveOrUpdate(orderCustomer);

        //get topping calorie values from API

        if(toppings.contains("Sausage")){
            client = ClientBuilder.newClient();
            calories += getKcal(foodProperties.getProperty("sausageID"), client);

        }
        if(toppings.contains("pepperoni")){
            client = ClientBuilder.newClient();
            calories += getKcal(foodProperties.getProperty("pepperoniID"),client);

        }
        if(toppings.contains("olives")){
            client = ClientBuilder.newClient();
            calories += getKcal(foodProperties.getProperty("oliveID"),client);
        }
        if(toppings.contains("onions")){
            client = ClientBuilder.newClient();
            calories += getKcal(foodProperties.getProperty("onionID"),client);
        }
        if(toppings.contains("mushrooms")){
            client = ClientBuilder.newClient();
            calories += getKcal(foodProperties.getProperty("mushroomID"),client);
        }


        price = price - rewardsUsed;
        //set attributes for thank you page
        req.setAttribute("price", price);
        req.setAttribute("Calories",calories);

        //redirect to thank you page
        RequestDispatcher dispatcher = req.getRequestDispatcher("/orderthanks.jsp");
        dispatcher.forward(req, resp);


    }

    /**
     * Takes openfoodfacts API URL and returns the kcal value
     * @param foodID ID to get KCals for
     * @param client client
     * @return food kcal value
     * @throws JsonProcessingException
     */
    private int getKcal(String foodID, Client client) throws JsonProcessingException {
        int estimatedCalories;
        WebTarget target =
                client.target("https://world.openfoodfacts.org/api/v0/product/" + foodID +".json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Response responseObj = mapper.readValue(response, Response.class);
        estimatedCalories = responseObj.getProduct().getNutriments().getEnergyKcal();
        return estimatedCalories;
    }

    /**
     * Loads the food api IDs from file
     */
    private void loadProperties() {
        try {
            foodProperties = loadProperties("apiIDs.properties");
        }  catch (IOException ioException) {
            logger.error("Cannot load properties..." + ioException.getMessage(), ioException);
        } catch (Exception e) {
            logger.error("Error loading properties" + e.getMessage(), e);
        }
    }
}
