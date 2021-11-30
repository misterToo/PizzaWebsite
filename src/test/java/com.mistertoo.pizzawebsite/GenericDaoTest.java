package com.mistertoo.pizzawebsite;

import com.mistertoo.pizzawebsite.entity.*;
import com.mistertoo.pizzawebsite.persistence.*;
import com.mistertoo.pizzawebsite.test.util.Database;
import org.hibernate.annotations.GenericGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


public class GenericDaoTest {
    GenericDao<Order> orderDao;
    GenericDao<Customer> customerDAO ;

    @BeforeEach
    void setUp(){
        Database database = Database.getInstance();
        database.runSQL("dbrefresh.sql");
        orderDao = new GenericDao<>(Order.class);
        customerDAO = new GenericDao<>(Customer.class);
    }

    //@Test
    void getAllCustomer(){
        List<Customer> customers = customerDAO.getAll();
        assertEquals(1,customers.size());
    }

    @Test
    void insertCustomerSuccess(){
        Customer newCustomer = new Customer("dFlannigan","dave.f@gmail.com");
        int id = customerDAO.insert(newCustomer);
        assertNotEquals(0,id);
        Customer expectedCustomer = customerDAO.getByID(id);
        assertEquals("Dave", expectedCustomer.getuName());
    }
    @Test
    void deleteCustomerSuccess(){
        Customer newCustomer = new Customer("dFlannigan","dave.f@gmail.com");
        int id = customerDAO.insert(newCustomer);
        customerDAO.delete(newCustomer);
        assertNull(customerDAO.getByID(id));
    }
    @Test
    void getCustomerByIdSuccess(){
        Customer newCustomer = new Customer("dFlannigan","dave.f@gmail.com");
        int id = customerDAO.insert(newCustomer);
        Customer expectedCustomer = customerDAO.getByID(id);
        assertEquals(expectedCustomer.getuName(), newCustomer.getuName());
    }
}
