/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.rm;

import com.stan.domain.Contact;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class ContactRowMapper implements RowMapper<Contact>{

    @Override
    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
         Contact c = new Contact();
         c.setContactId(rs.getInt("contactid"));
         c.setUserId(rs.getInt("userid"));
         c.setName(rs.getString("name"));
         c.setName(rs.getString("name"));
         c.setPhone(rs.getString("phone"));
         c.setEmail(rs.getString("email"));
         c.setAddress(rs.getString("address"));
         c.setRemark(rs.getString("remark"));
         return c;
    }

    }
