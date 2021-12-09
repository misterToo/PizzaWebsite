package com.mistertoo.pizzawebsite.controller;
import com.mistertoo.pizzawebsite.entity.Address;
import com.mistertoo.pizzawebsite.entity.Customer;
import com.mistertoo.pizzawebsite.entity.Order;
import com.mistertoo.pizzawebsite.persistence.GenericDao;
import org.json.HTTP;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * The type Update account.
 */
@WebServlet(
        urlPatterns = {"/updateAccount"}
)
public class UpdateAccount extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //set up utilities
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        GenericDao<Customer> customerDAO = new GenericDao<>(Customer.class);
        GenericDao<Address> addressDAO = new GenericDao<>(Address.class);
        HttpSession session = req.getSession(false);

        //get customer to update
        String userName = (String) session.getAttribute("userName");
        Map<String,Object> propertyMap = new HashMap<>();
        propertyMap.put("uName", userName);
        Customer orderCustomer = customerDAO.findByPropertyEqual(propertyMap).get(0);

        //create address object
        String newAddress = req.getParameter("address");
        Address address = new Address();
        address.setAddress(newAddress);
        address.setCustomerID(orderCustomer.getID());

        //validate address
        try{
            Set<ConstraintViolation<Address>> addressConstraintViolations = validator.validate(address);
            ;
            if(addressConstraintViolations.size()>0){
                throw new Exception("constraints failed to validate when adding address");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //insert address into db
        addressDAO.insert(address);
        //update addresses session variable for order form
        Map<String,Object> addressPropertyMap = new HashMap<>();
        addressPropertyMap.put("customerID",orderCustomer.getID());
        session.setAttribute("addresses",addressDAO.findByPropertyEqual(addressPropertyMap));

        //redirect back to index after all done
        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req, resp);

    }
}
