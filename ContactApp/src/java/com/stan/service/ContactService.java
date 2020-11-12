/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.service;

import com.stan.domain.Contact;
import java.util.List;

/**
 *
 * @author IFM-COMPLIANCE
 */
public interface ContactService {
    public void save(Contact c);
    public void update(Contact c);
    public void delete(Integer contactId);
    public void delete(Integer[] contactIds);
    public Contact findById(Integer contactId);
    public List<Contact> findUserContact(Integer userId);
    public List<Contact> findUserContact(Integer userId, String text);
    
}
