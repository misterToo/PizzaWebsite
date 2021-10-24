package com.mistertoo.pizzawebsite.persistence;

import com.mistertoo.pizzawebsite.entity.Customer;
import jdk.internal.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;

public class abstractDAO <T extends Serializable> {
    private Class<T> anyClass;

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    public void setAnyClass(final Class<T> anyClassToSet){
        if(anyClassToSet != null) {
            anyClass = anyClassToSet;
        }
    }

    public T getByID(int id){
        Session session = sessionFactory.openSession();
        T customer = session.get(anyClass, id);
        session.close();
        return customer;
    }
}
