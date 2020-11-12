/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.dao;

import com.stan.domain.Contact;
import java.util.List;

/**
 *
 * @author IFM-COMPLIANCE
 */
public interface ContactDao {
    public void save(Contact c);
    public void update(Contact c);
    public void delete(Contact c);
    public void delete(Integer contactId);
    public Contact findById(Integer contactId);
    public List<Contact> findAll();
    public List<Contact> findProp(String propName, Object propVal);
}
