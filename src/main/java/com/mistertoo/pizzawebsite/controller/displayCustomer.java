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

@WebServlet(
        urlPatterns = {"/displayCustomer"}
)

public class displayCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao<Customer> dao = new GenericDao<>(Customer.class);
        req.setAttribute("customers", dao.getAll());
        req.setAttribute("title", "All Customers: ");
        HttpSession session = req.getSession(false);
        req.setAttribute("userName", session.getAttribute("userName"));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);


    }

}
