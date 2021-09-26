


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;



class CustomerDAOTest {
    CustomerDAO dao;

    @BeforeEach
    void setUp(){
        dao = new CustomerDAO();
    }

    @Test
    void getAllSuccess() {
        List<Customer> customers = dao.getAll();
        assertEquals(0,customers.size());
    }

    @Test
    void insertSuccess(){
        Customer newCustomer = new Customer("Dave","Flannigan","dave.f@gmail.com");

    }
}
