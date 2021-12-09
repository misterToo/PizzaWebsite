package com.mistertoo.pizzawebsite.controller;

import com.mistertoo.pizzawebsite.entity.Customer;
import com.mistertoo.pizzawebsite.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Delete account Servlet.
 */
@WebServlet(
        urlPatterns = {"/deleteAccount"}
)

public class DeleteAccount extends HttpServlet{
    /**
     * Customer DAO
     */
    GenericDao<Customer> dao = new GenericDao<>(Customer.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //grab user from DB
        HttpSession session = req.getSession(false);
        String userName = (String) session.getAttribute("userName");
        Map<String, Object> propertyMap = new HashMap<>();
        propertyMap.put("uName", userName);
        Customer currentCustomer = dao.findByPropertyEqual(propertyMap).get(0);

        //delete customer, invalidate session vars with user data
        dao.delete(currentCustomer);
        session.invalidate();

        //redirect back home
        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }
}
