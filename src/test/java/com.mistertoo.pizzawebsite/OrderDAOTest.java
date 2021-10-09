package com.mistertoo.pizzawebsite;

import com.mistertoo.pizzawebsite.entity.*;
import com.mistertoo.pizzawebsite.persistence.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class OrderDAOTest {
    OrderDAO dao;

    //@BeforeEach
    void setUp(){

        dao = new OrderDAO();
    }

    //@Test
    void getAllSuccess() {
        List<Order> orders = dao.getAll();
        Assertions.assertEquals(0,orders.size());
    }

    //@Test
    void insertSuccess(){
        Order newOrder = new Order("Small","Sausage",true, "pickup");
        int id = dao.insert(newOrder);
        assertNotEquals(0,id);
        Order expectedOrder = dao.getByOrderID(id);
        assertEquals("Small",expectedOrder.getSize());
    }
    //@Test
    void deleteSuccess(){
        Order newOrder = new Order("Small","Sausage",true, "pickup");
        int id = dao.insert(newOrder);
        dao.delete(newOrder);
        assertNull(dao.getByOrderID((id)));
    }
}