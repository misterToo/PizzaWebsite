package com.mistertoo.pizzawebsite.persistence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
public class OrderDAOTest {
    OrderDAO dao;

    @BeforeEach
    void setUp(){

        dao = new OrderDAO();
    }

    @Test
    void getAllSuccess() {
        List<Order> orders = dao.getAll();
        Assertions.assertEquals(0,orders.size());
    }
}