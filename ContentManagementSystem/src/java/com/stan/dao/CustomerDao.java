/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.dao;

import java.util.List;
import com.stan.domain.Customer;
import org.springframework.stereotype.Component;

/**
 *
 * @author IFM-COMPLIANCE
 */
//@Component
public interface CustomerDao {
    public List<Customer> listCustomer();

    public void saveCustomer(Customer cust);
    
    public Customer getCustomer(int cid);

    public void deleteCustomer(int cid);
    
    public List<Customer> findCust(Integer custId, String text);
    
    public List<Customer> findCust(String text);
}
