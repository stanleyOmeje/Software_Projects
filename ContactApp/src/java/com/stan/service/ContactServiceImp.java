/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.service;

import com.stan.dao.BaseDAO;
import com.stan.dao.ContactDao;
import com.stan.domain.Contact;
import com.stan.rm.ContactRowMapper;
import com.stan.util.CommaSeperatedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author IFM-COMPLIANCE
 */
@Service
public class ContactServiceImp extends BaseDAO implements ContactService{
 
    @Autowired
    ContactDao contactDao;
   
    @Override
    public void save(Contact c) {
       contactDao.save(c);
    }

    @Override
    public void update(Contact c) {
        contactDao.update(c);
    }

    @Override
    public void delete(Integer contactId) {
        contactDao.delete(contactId);
    }

    @Override
    public void delete(Integer[] contactIds) {
        String ids = CommaSeperatedList.getList(contactIds);
        String query ="delete from contact where contactid IN("+ids+")";
        getJdbcTemplate().update(query);
    }

    @Override
    public List<Contact> findUserContact(Integer userId) {
      return contactDao.findProp("userid", userId);
    }

    @Override
    public List<Contact> findUserContact(Integer userId, String text) {
        String query = "select contactid, userid, name, phone, email, address, remark from contact"
                + " where userid =? AND (name LIKE '%"+text+"%' OR phone LIKE '%"+text+"%' OR email LIKE '%"+text+"%' OR address LIKE '%"+text+"%' OR remark LIKE '%"+text+"%')";
        return getJdbcTemplate().query(query, new ContactRowMapper(), userId);
    }

    @Override
    public Contact findById(Integer contactId) {
        return contactDao.findById(contactId);
    }
    
}
