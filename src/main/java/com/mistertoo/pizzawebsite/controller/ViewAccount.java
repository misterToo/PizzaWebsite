package com.mistertoo.pizzawebsite.controller;

import com.mistertoo.pizzawebsite.entity.Address;
import com.mistertoo.pizzawebsite.entity.Customer;
import com.mistertoo.pizzawebsite.entity.Order;
import com.mistertoo.pizzawebsite.persistence.GenericDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "ViewAccount", value = "/ViewAccount")
public class ViewAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userName = session.getAttribute("userName").toString();
        GenericDao<Customer> dao = new GenericDao<>(Customer.class);
        GenericDao<Order> orderDao = new GenericDao<Order>(Order.class);
        GenericDao<Address> adressDao = new GenericDao<>(Address.class);
        Map<String, Object> propertyMap = new HashMap<>();
        propertyMap.put("uName", userName);
        Map<String, Object> orderPropertyMap = new HashMap<>();


        Customer currentCustomer = dao.findByPropertyEqual(propertyMap).get(0);
        orderPropertyMap.put("customerID", currentCustomer.getID());
        request.setAttribute("userName", currentCustomer.getuName());
        request.setAttribute("rewards",currentCustomer.getRewards());
        request.setAttribute("email",currentCustomer.getEmail());
        request.setAttribute("toNextReward", currentCustomer.getToNextReward());
        request.setAttribute("orders", orderDao.findByPropertyEqual(orderPropertyMap));

        Map<String, Object> propertyMapAddress = new HashMap<>();
        propertyMapAddress.put("customerID", currentCustomer.getID());
        List<Address> adresses = adressDao.findByPropertyEqual(propertyMapAddress);
        request.setAttribute("addresses", adresses);




        //TODO Update account


        RequestDispatcher dispatcher = request.getRequestDispatcher("/accountdetails.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
