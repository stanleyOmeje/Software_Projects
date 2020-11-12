/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.dao;

import com.stan.domain.Contact;
import com.stan.rm.ContactRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author IFM-COMPLIANCE
 */
@Repository
public class ContactDaoImp extends BaseDAO implements ContactDao{

    @Override
    public void save(Contact c) {
        String query = "insert into contact(userid, name, phone, email, address, remark) "
                + "values(:userid, :name, :phone, :email, :address, :remark)";
       // Contact ct = new Contact();
       Map m = new HashMap();
       m.put("userid", c.getUserId());
       m.put("name", c.getName());
       m.put("phone", c.getPhone());
       m.put("email", c.getEmail());
       m.put("address", c.getAddress());
       m.put("remark", c.getRemark());
       
       KeyHolder kh = new GeneratedKeyHolder();
       SqlParameterSource p = new MapSqlParameterSource(m);
       super.getNamedParameterJdbcTemplate().update(query, p, kh);
       Integer cid = kh.getKey().intValue();
       c.setContactId(cid);
       
       
    }

    @Override
    public void update(Contact c) {
        String query = "update contact set name =:name, phone =:phone, email =:email, "
                + "address =:address, remark =:remark where contactid =:contactid";
       Map m = new HashMap();
     
       m.put("name", c.getName());
       m.put("phone", c.getPhone());
       m.put("email", c.getEmail());
       m.put("address", c.getAddress());
       m.put("remark", c.getRemark());
       m.put("contactid", c.getContactId());
       
       SqlParameterSource p = new MapSqlParameterSource(m);
       super.getNamedParameterJdbcTemplate().update(query, p);  
    }

    @Override
    public void delete(Integer contactId) {
        String query= "delete from contact where contactid = ?";
        getJdbcTemplate().update(query, contactId);
    }

    @Override
    public void delete(Contact c) {
        this.delete(c.getContactId());
        
    }

    @Override
    public Contact findById(Integer contactId) {
        String query = "select contactid, userid, name, phone, email, address, remark from contact"
                + " where contactid = ?";
        Contact c = getJdbcTemplate().queryForObject(query, new ContactRowMapper(), contactId);
        return c;
    }

    @Override
    public List<Contact> findAll() {
        String query = "select contactid, userid, name, phone, email, address, remark from contact";
              return getJdbcTemplate().query(query, new ContactRowMapper());  
    }

    @Override
    public List<Contact> findProp(String propName, Object propVal) {
        String query = "select contactid, userid, name, phone, email, address, remark from contact"
                + " where "+propName+" = ?";
        return getJdbcTemplate().query(query, new ContactRowMapper(), propVal);
        
    }

   }
