package com.mistertoo.pizzawebsite;

import com.mistertoo.pizzawebsite.entity.*;
import com.mistertoo.pizzawebsite.persistence.*;
import com.mistertoo.pizzawebsite.test.util.Database;
import org.hibernate.annotations.GenericGenerator;
import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


public class GenericDaoTest {
    GenericDao<Order> orderDao;
    GenericDao<Customer> customerDAO ;
    GenericDao<Address> addressDAO;

    @BeforeEach
    void setUp(){
        Database database = Database.getInstance();
        database.runSQL("dbrefresh.sql");
        orderDao = new GenericDao<>(Order.class);
        customerDAO = new GenericDao<>(Customer.class);
        addressDAO = new GenericDao<>(Address.class);
    }

    @Test
    void getAllCustomer(){
        List<Customer> customers = customerDAO.getAll();
        assertEquals(1,customers.size());
    }

    @Test
    void getAllOrder(){
        List<Order> orders = orderDao.getAll();
        assertEquals(0,orders.size());
    }

    @Test
    void getAllAddress(){
        List<Address> addresses = addressDAO.getAll();
        assertEquals(0,addresses.size());
    }

    @Test
    void insertCustomerSuccess(){
        Customer newCustomer = new Customer("mDerek","mike.derek@gmail.com");
        int id = customerDAO.insert(newCustomer);
        assertNotEquals(0,id);
        Customer expectedCustomer = customerDAO.getByID(id);
        assertEquals("mDerek", expectedCustomer.getuName());
    }
    @Test
    void insertOrderSuccess(){
        Map<String,Object> propertyMap = new HashMap<>();
        propertyMap.put("uName","dFlannigan");
        Order newOrder = new Order("small","sausage",false,"fake street",customerDAO.findByPropertyEqual(propertyMap).get(0).getID());
        int id = orderDao.insert(newOrder);
        Order expectedOrder = orderDao.getByID(id);
        assertEquals("small",expectedOrder.getSize());
    }

    @Test
    void insertAddressSuccess(){
        String userName = "dFlannigan";
        Map<String,Object> propertyMap = new HashMap<>();
        propertyMap.put("uName",userName);
        Customer resultCustomer = customerDAO.findByPropertyEqual(propertyMap).get(0);
        Address address = new Address();
        address.setAddress("39 Angeles Crest Hwy");
        address.setCustomerID(resultCustomer.getID());
        int id = addressDAO.insert(address);
        Address expected = addressDAO.getByID(id);
        assertEquals(address.getAddress(),expected.getAddress());
    }

    @Test
    void deleteCustomerSuccess(){
        Customer newCustomer = new Customer("mBailey","mike.bailey@gmail.com");
        int id = customerDAO.insert(newCustomer);
        customerDAO.delete(newCustomer);
        assertNull(customerDAO.getByID(id));
    }

    @Test
    void getCustomerByIdSuccess(){
        Customer newCustomer = new Customer("bDave","bave.dave@gmail.com");
        int id = customerDAO.insert(newCustomer);
        Customer expectedCustomer = customerDAO.getByID(id);
        assertEquals(expectedCustomer.getuName(), newCustomer.getuName());
    }

    @Test
    void getCustomerByUserNameSuccess(){
        Customer newCustomer = new Customer("mFlannigan", "mary.flannigan@email.com");
        String userName = "mFlannigan";
        customerDAO.insert(newCustomer);
        Map<String,Object> propertyMap = new HashMap<>();
        propertyMap.put("uName",userName);
        List<Customer> resultList = customerDAO.findByPropertyEqual(propertyMap);
        assertEquals(resultList.get(0).getuName(), newCustomer.getuName());
    }


    @Test
    void findAddressByCustomerIDTest(){
        String userName = "dFlannigan";
        Map<String,Object> propertyMap = new HashMap<>();
        propertyMap.put("uName",userName);
        Customer resultCustomer = customerDAO.findByPropertyEqual(propertyMap).get(0);
        Address address = new Address();
        address.setAddress("39 Angeles Crest Hwy");
        address.setCustomerID(resultCustomer.getID());
        int id = addressDAO.insert(address);
        propertyMap = new HashMap<>();
        propertyMap.put("customerID",resultCustomer.getID());
        Address resultAddress = addressDAO.findByPropertyEqual(propertyMap).get(0);
        assertEquals(address.getAddress(),resultAddress.getAddress());
    }
    @Test
    void updateCustomer(){
        String userName = "dFlannigan";
        Map<String,Object> propertyMap = new HashMap<>();
        propertyMap.put("uName",userName);
        Customer resultCustomer = customerDAO.findByPropertyEqual(propertyMap).get(0);
        int id = resultCustomer.getID();
        resultCustomer.setEmail("DFLANNIGAN@DFLANNIGAN.ORG");
        customerDAO.saveOrUpdate(resultCustomer);
        assertEquals(resultCustomer.getEmail(),customerDAO.getByID(id).getEmail());
    }

    @After
    void tearDown(){

    }
}
