/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.dao;

//import com.stan.domain.Customer;
import com.stan.domain.Customer;
import java.util.List;
//import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author IFM-COMPLIANCE
 */
@Repository
//@Component
public class CustomerDaoImp implements CustomerDao{
    
    @Autowired
    SessionFactory sessionFactory;
    
    

    @Override
  //  @Transactional
    public List<Customer> listCustomer() {
        //get currentSession
    Session session = sessionFactory.getCurrentSession();
    
    //create Query
    Query <Customer> query = session.createQuery("from Customer order by lastName", Customer.class);
    
    //execute query
    List<Customer> cust = query.getResultList();
    
    //return result
    return cust;
    }

    @Override
    public void saveCustomer(Customer cust) {
        Session session = sessionFactory.getCurrentSession();
        //Customer customer = new Customer();
        session.saveOrUpdate(cust);
       
    }

    @Override
    public Customer getCustomer(int cid) {
         //get current session
         Session session = sessionFactory.getCurrentSession();
         
         //pull values from db
         Customer customer = session.get(Customer.class, cid);
         
         return customer;
    }

    @Override
    public void deleteCustomer(int cid) {
         //get current session
         Session session = sessionFactory.getCurrentSession();
         Query query = session.createQuery("delete from Customer where id =:theId");
         //Customer customer = session.get(Customer.class, cid);
         query.setParameter("theId", cid);
         query.executeUpdate();
    }

    @Override
    public List<Customer> findCust(Integer custId, String text) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer where id =:theId AND ( firstName like '%"+text+"%'"
                + " OR lastName like '%"+text+"%' OR email like '%"+text+"%')", Customer.class);
        query.setParameter("theId", custId);
        List<Customer> customer = query.getResultList();
        return customer;

    }

    @Override
    public List<Customer> findCust(String text) {
    Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer where (id like '%"+text+"%' OR firstName like '%"+text+"%'"
                + " OR lastName like '%"+text+"%' OR email like '%"+text+"%')", Customer.class);
        //query.setParameter("theId", custId);
        List<Customer> customer = query.getResultList();
        return customer;
    }
    
    
}
