package com.mistertoo.pizzawebsite.persistence;


import org.apache.logging.log4j.*;
import org.hibernate.*;
import javax.persistence.*;
import javax.persistence.criteria.*;
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
        session.close();
        return orders;

    }
}
