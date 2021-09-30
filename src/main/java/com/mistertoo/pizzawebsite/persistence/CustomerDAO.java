package com.mistertoo.pizzawebsite.persistence;

import com.mistertoo.pizzawebsite.entity.Customer;
import org.apache.logging.log4j.*;
import org.hibernate.*;
import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.List;

public class CustomerDAO {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    public Customer getByID(int id){
        Session session = sessionFactory.openSession();
        Customer customer = session.get(Customer.class, id);
        session.close();
        return customer;
    }

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
    public int insert (Customer customer){
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id =(int)session.save(customer);
        transaction.commit();
        session.close();
        return id;
    }
    public void delete(Customer customer){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(customer);
        transaction.commit();
        session.close();
    }

    public void update(Customer customer){
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(customer);
        session.close();
    }
}
