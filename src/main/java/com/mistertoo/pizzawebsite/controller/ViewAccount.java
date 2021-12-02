package com.mistertoo.pizzawebsite.controller;

import com.mistertoo.pizzawebsite.entity.Customer;
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
        Map<String, Object> propertyMap = new HashMap<>();
        propertyMap.put("user_name", userName);
//
  //      request.setAttribute("userName", currentCustomer.getuName());
 //       request.setAttribute("rewards",currentCustomer.getRewards());
 //       request.setAttribute("email",currentCustomer.getEmail());
//        request.setAttribute("address",currentCustomer.getAddress());
//
        RequestDispatcher dispatcher = request.getRequestDispatcher("/accountdetails.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
