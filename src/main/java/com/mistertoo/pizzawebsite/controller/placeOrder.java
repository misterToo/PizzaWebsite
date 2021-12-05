package com.mistertoo.pizzawebsite.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mistertoo.pizzawebsite.entity.Customer;
import com.mistertoo.pizzawebsite.entity.Nutriments;
import com.mistertoo.pizzawebsite.entity.Order;
import com.mistertoo.pizzawebsite.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpSession;
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
        Logger logger = LogManager.getLogger(this.getClass());
        boolean pickup;
        pickup = req.getParameter("pickup") == "1";
        String address = req.getParameter("address");
        List<String> toppings;
        String allToppings = "";
        String size = req.getParameter("size");
        toppings = Arrays.asList(req.getParameterValues("toppings"));
        int calories = 0;
        GenericDao<Order> orderDao = new GenericDao<>(Order.class);
        GenericDao<Customer> customerDAO = new GenericDao<>(Customer.class);
        String pepperoniID = "5052004649513";
        String mushroomID ="3222471027325";
        String onionID ="20242305";
        String oliveID ="0053800950020";
        String sausageID ="07203660021";
        logger.debug(toppings.toString());

        HttpSession session = req.getSession(false);
        String userName = (String) session.getAttribute("userName");
        Map<String,Object> propertyMap = new HashMap<>();
        propertyMap.put("uName", userName);
        Customer orderCustomer = customerDAO.findByPropertyEqual(propertyMap).get(0);

        for(int i = 0; i<toppings.size();i++){
            allToppings += toppings.get(i) + " ";
        }

        Order newOrder = new Order(size,allToppings,pickup,address,orderCustomer.getID());
        orderDao.insert(newOrder);
        /**
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
        **/
        req.setAttribute("Calories",calories);

        //redirect
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
