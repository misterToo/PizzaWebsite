package com.mistertoo.pizzawebsite.persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericDao<T> {
    private Class<T> type;

    public GenericDao(Class<T> type){this.type = type;}


    public List<T> getAll(){
        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        List<T> list = session.createQuery(query).getResultList();
        session.close();
        return list;
    }

    public T getByID(Integer id){
        Session session = getSession();
        T entity = (T) session.get(type, id);
        session.close();
        return entity;
    }


    public void delete (T entity){
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }

    public Integer insert(T entity){
        Integer id = 0;
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        id =(Integer) session.save(entity);
        transaction.commit();
        session.close();
        return id;
    }

    public void saveOrUpdate(T entity){
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
        session.close();
    }

    public List<T> findByPropertyEqual(String propertyName, String value){
        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        query.select(root).where(builder.equal(root.get(propertyName),value));
        session.close();
        return session.createQuery(query).getResultList();
    }

    private Session getSession(){
        return SessionFactoryProvider.getSessionFactory().openSession();
    }
}
