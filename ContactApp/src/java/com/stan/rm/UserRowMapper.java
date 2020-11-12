/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.rm;

import com.stan.domain.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
//import javax.swing.tree.RowMapper;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User u = new User();
        u.setUserId(rs.getInt("userid"));
        u.setName(rs.getString("name"));
        u.setPhone(rs.getString("phone"));
        u.setEmail(rs.getString("email"));
        u.setAddress(rs.getString("address"));
        u.setLoginName(rs.getString("loginName"));
        u.setRole(rs.getInt("role"));
        u.setLoginStatus(rs.getInt("loginStatus"));
        return u;


    }
          
}

    

