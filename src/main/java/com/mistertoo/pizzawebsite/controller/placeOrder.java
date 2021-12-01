package com.mistertoo.pizzawebsite.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mistertoo.pizzawebsite.entity.Nutriments;
import com.mistertoo.pizzawebsite.entity.Order;
import com.mistertoo.pizzawebsite.persistence.GenericDao;

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

@WebServlet(
        urlPatterns = {"/placeOrder"}
)

public class placeOrder extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        boolean pickup;
        pickup = req.getParameter("pickup") == "1";
        String address = req.getParameter("address");
        String toppings;
        String size = req.getParameter("size");
        int estimatedCalories;
        GenericDao<Order> dao = new GenericDao<>(Order.class);
        String foodID;


        HttpSession session = req.getSession(false);
        String userName = (String) session.getAttribute("userName");

        //api for calorie value
        foodID = "737628064502";
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://world.openfoodfacts.org/api/v0/product/" +foodID+".json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Nutriments nutriments = mapper.readValue(response,Nutriments.class);

        estimatedCalories = nutriments.getEnergyKcal();
        req.setAttribute("Calories",estimatedCalories);

        //redirect
        RequestDispatcher dispatcher = req.getRequestDispatcher("/orderthanks.jsp");
        dispatcher.forward(req, resp);


    }
}
