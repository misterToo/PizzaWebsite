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

/**
 * View Account Servlet
 */
@WebServlet(name = "ViewAccount", value = "/ViewAccount")
public class ViewAccount extends HttpServlet {

    /**
     * Customer Dao.
     */
    GenericDao<Customer> dao = new GenericDao<>(Customer.class);
    /**
     * Order dao.
     */
    GenericDao<Order> orderDao = new GenericDao<Order>(Order.class);
    /**
     * Address dao.
     */
    GenericDao<Address> addressDao = new GenericDao<>(Address.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //util vars
        HttpSession session = request.getSession();
        String userName = session.getAttribute("userName").toString();

        //DB search criteria
        Map<String, Object> propertyMap = new HashMap<>();
        propertyMap.put("uName", userName);
        Map<String, Object> orderPropertyMap = new HashMap<>();

        //grabs customer from DB and puts the attributes into the request
        Customer currentCustomer = dao.findByPropertyEqual(propertyMap).get(0);
        orderPropertyMap.put("customerID", currentCustomer.getID());
        request.setAttribute("userName", currentCustomer.getuName());
        request.setAttribute("rewards",currentCustomer.getRewards());
        request.setAttribute("email",currentCustomer.getEmail());
        request.setAttribute("toNextReward", currentCustomer.getToNextReward());
        request.setAttribute("orders", orderDao.findByPropertyEqual(orderPropertyMap));

        Map<String, Object> propertyMapAddress = new HashMap<>();
        propertyMapAddress.put("customerID", currentCustomer.getID());
        List<Address> addresses = addressDao.findByPropertyEqual(propertyMapAddress);
        request.setAttribute("addresses", addresses);

        //forward to results page
        RequestDispatcher dispatcher = request.getRequestDispatcher("/accountdetails.jsp");
        dispatcher.forward(request, response);
    }

}
