
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
        int id = dao.insert(newCustomer);
        assertNotEquals(0,id);
        Customer expectedCustomer = dao.getByID(id);
        assertEquals("Dave", expectedCustomer.getfName());
    }

    @Test
    void deleteSuccess(){
        Customer newCustomer = new Customer("Dave","Flannigan","dave.f@gmail.com");
        int id = dao.insert(newCustomer);
        dao.delete(newCustomer);
        assertNull(dao.getByID(id));
    }

    @Test
    void getByIdSuccess(){
        Customer newCustomer = new Customer("Dave","Flannigan","dave.f@gmail.com");
        int id = dao.insert(newCustomer);
        Customer expectedCustomer = dao.getByID(id);
        assertTrue(expectedCustomer.equals(newCustomer));
    }
}
