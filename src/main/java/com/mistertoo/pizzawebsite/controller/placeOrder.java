package com.mistertoo.pizzawebsite.controller;

import com.mistertoo.pizzawebsite.entity.Customer;
import com.mistertoo.pizzawebsite.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/placeOrder"}
)

public class placeOrder extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

    }
}
