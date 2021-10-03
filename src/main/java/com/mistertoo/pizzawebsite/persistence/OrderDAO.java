package com.mistertoo.pizzawebsite.persistence;


import com.mistertoo.pizzawebsite.entity.Customer;
import org.apache.logging.log4j.*;
import org.hibernate.*;
import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.List;

public class OrderDAO {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
}
