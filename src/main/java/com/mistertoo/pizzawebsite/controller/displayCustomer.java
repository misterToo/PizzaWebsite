package com.mistertoo.pizzawebsite.controller;

import com.mistertoo.pizzawebsite.persistence.CustomerDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/displayCustomer"}
)

public class displayCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CustomerDAO dao = new CustomerDAO();
        String committed = "commit";
        req.setAttribute("customers", dao.getAll());
        req.setAttribute("title", "All Customers: ");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }

}
