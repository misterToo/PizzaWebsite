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

/**
 * Display all customers servlet
 */
@WebServlet(
        urlPatterns = {"/displayCustomer"}
)

public class displayCustomer extends HttpServlet {
    /**
     * Customer DAO
     */
    GenericDao<Customer> dao = new GenericDao<>(Customer.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //grab all customers frmo database
        req.setAttribute("customers", dao.getAll());
        req.setAttribute("title", "All Customers: ");

        //grab logged in username from session
        HttpSession session = req.getSession(false);
        req.setAttribute("userName", session.getAttribute("userName"));

        //redirect to results page
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);


    }

}
