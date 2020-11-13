/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.service;

import com.stan.dao.CustomerDao;
import com.stan.domain.Customer;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author IFM-COMPLIANCE
 */
@Repository
public class CustomerServiceImp implements CustomerService{

    @Autowired
    CustomerDao customerDao; 
    
    @Override
    @Transactional
    public List<Customer> listCustomer() 
    {
       List<Customer> customer = customerDao.listCustomer();
       return customer;
    }

    @Override
    @Transactional
    public void saveCustomer(Customer cust) {
        customerDao.saveCustomer(cust);
    }

    @Override
    @Transactional
    public Customer getCustomer(int cid) {
     Customer customer = customerDao.getCustomer(cid);
     return customer;
    }

    @Override
    @Transactional
    public void deleteCustomer(int cid) {
         //To change body of generated methods, choose Tools | Templates.
         customerDao.deleteCustomer(cid);
    }

    @Override
    @Transactional
    public List<Customer> findCust(Integer custId, String text) {
       List<Customer> c = customerDao.findCust(custId, text);
       return c;
    }

    @Override
    @Transactional
    public List<Customer> findCust(String text) {
      List<Customer> c = customerDao.findCust(text);
       return c;
    }
    
}
