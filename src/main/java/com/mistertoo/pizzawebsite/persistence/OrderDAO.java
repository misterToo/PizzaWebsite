package com.mistertoo.pizzawebsite.persistence;

import com.mistertoo.pizzawebsite.entity.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class OrderDAO {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    public Order getByOrderID(int id){
        Session session = sessionFactory.openSession();
        Order order = session.get(Order.class, id);
        session.close();
        return order;
    }
    public int insert (Order order){
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(order);
        transaction.commit();
        session.close();
        return id;
    }
    public void update(Order order){
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(order);
        session.close();
    }
    public void delete(Order order){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(order);
        transaction.commit();
        session.close();
    }
    public List<Order> getAll(){
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Order> query = builder.createQuery(Order.class);
        Root<Order> root = query.from(Order.class);
        List<Order> orders = session.createQuery(query).getResultList();
        logger.debug("The list of Orders: " + orders);
        session.close();
        return orders;

    }
}
