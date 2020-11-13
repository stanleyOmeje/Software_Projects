/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.service;

import com.stan.domain.Customer;
import java.util.List;

/**
 *
 * @author IFM-COMPLIANCE
 */
public interface CustomerService {
     public List<Customer> listCustomer();

    public void saveCustomer(Customer cust);
    
    public Customer getCustomer(int cid);

    public void deleteCustomer(int cid);
    
    public List<Customer> findCust(Integer custId, String text);
    
    public List<Customer> findCust(String text);
    
}
