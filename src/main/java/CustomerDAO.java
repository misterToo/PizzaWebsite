import org.apache.logging.log4j.*;
import org.hibernate.*;
import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.List;

public class CustomerDAO {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


    public List<Customer> getAll(){
        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Customer> query = builder.createQuery(Customer.class);
        Root<Customer> root = query.from(Customer.class);
        List<Customer> customers = session.createQuery(query).getResultList();

        logger.debug("The list of Customers: " + customers);
        session.close();
        return customers;

    }
}
