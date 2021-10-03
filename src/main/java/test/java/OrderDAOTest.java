package test.java;
import com.mistertoo.pizzawebsite.entity.Customer;
import com.mistertoo.pizzawebsite.persistence.CustomerDAO;
import com.mistertoo.pizzawebsite.persistence.OrderDAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.criteria.Order;

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
