package com.mistertoo.pizzawebsite.controller;
import com.mistertoo.pizzawebsite.entity.Address;
import com.mistertoo.pizzawebsite.entity.Customer;
import com.mistertoo.pizzawebsite.persistence.GenericDao;
import org.json.HTTP;

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

@WebServlet(
        urlPatterns = {"/updateAccount"}
)
public class UpdateAccount extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        GenericDao<Customer> customerDAO = new GenericDao<>(Customer.class);
        GenericDao<Address> addressDAO = new GenericDao<>(Address.class);
        HttpSession session = req.getSession(false);
        String userName = (String) session.getAttribute("userName");
        Map<String,Object> propertyMap = new HashMap<>();
        propertyMap.put("uName", userName);
        Customer orderCustomer = customerDAO.findByPropertyEqual(propertyMap).get(0);
        String newAddress = req.getParameter("address");
        Address address = new Address();
        address.setAddress(newAddress);
        address.setCustomerID(orderCustomer.getID());
        addressDAO.insert(address);
        Map<String,Object> addressPropertyMap = new HashMap<>();
        addressPropertyMap.put("customerID",orderCustomer.getID());
        session.setAttribute("addresses",addressDAO.findByPropertyEqual(addressPropertyMap));
        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req, resp);

    }
}
