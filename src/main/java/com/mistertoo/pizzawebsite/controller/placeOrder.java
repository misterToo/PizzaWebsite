package com.mistertoo.pizzawebsite.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mistertoo.pizzawebsite.entity.Customer;
import com.mistertoo.pizzawebsite.entity.Nutriments;
import com.mistertoo.pizzawebsite.entity.Order;
import com.mistertoo.pizzawebsite.persistence.GenericDao;
import com.sun.xml.bind.v2.runtime.reflect.opt.Const;
import jdk.jfr.StackTrace;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.glassfish.jersey.internal.inject.Custom;

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
 * The type Place order.
 */
@WebServlet(
        urlPatterns = {"/placeOrder"}
)

public class placeOrder extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //Create utilities
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Logger logger = LogManager.getLogger(this.getClass());
        GenericDao<Order> orderDao = new GenericDao<>(Order.class);
        GenericDao<Customer> customerDAO = new GenericDao<>(Customer.class);

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

        //set vars for API calorie query
        String pepperoniID = "5052004649513";
        String mushroomID ="3222471027325";
        String onionID ="20242305";
        String oliveID ="0053800950020";
        String sausageID ="07203660021";
        logger.debug(toppings.toString());


        //Get current customer from session
        HttpSession session = req.getSession(false);
        String userName = (String) session.getAttribute("userName");
        Map<String,Object> propertyMap = new HashMap<>();
        propertyMap.put("uName", userName);
        Customer orderCustomer = customerDAO.findByPropertyEqual(propertyMap).get(0);

        //calculate price
        if(Objects.equals(size, "small")){
            price += 8;
        } else if (Objects.equals(size, "medium")){
            price += 10;
        } else if (Objects.equals(size, "large")){
            price += 11;
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
            Client client = ClientBuilder.newClient();
            calories += getKcal(sausageID, client);

        }
        if(toppings.contains("pepperoni")){
            Client client = ClientBuilder.newClient();
            calories += getKcal(pepperoniID,client);

        }
        if(toppings.contains("olives")){
            Client client = ClientBuilder.newClient();
            calories += getKcal(oliveID,client);
        }
        if(toppings.contains("onions")){
            Client client = ClientBuilder.newClient();
            calories += getKcal(onionID,client);
        }
        if(toppings.contains("mushrooms")){
            Client client = ClientBuilder.newClient();
            calories += getKcal(mushroomID,client);
        }


        price = price - rewardsUsed;
        //set attributes for thank you page
        req.setAttribute("price", price);
        req.setAttribute("Calories",calories);

        //redirect to thank you page
        RequestDispatcher dispatcher = req.getRequestDispatcher("/orderthanks.jsp");
        dispatcher.forward(req, resp);


    }

    private int getKcal(String foodID, Client client) throws JsonProcessingException {
        int estimatedCalories;
        WebTarget target =
                client.target("https://world.openfoodfacts.org/api/v0/product/" + foodID +".json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Nutriments nutriments = mapper.readValue(response,Nutriments.class);
        estimatedCalories = nutriments.getEnergyKcal();
        return estimatedCalories;
    }
}
