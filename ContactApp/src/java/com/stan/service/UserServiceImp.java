/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.service;

import com.stan.dao.BaseDAO;
import com.stan.dao.UserDao;
import com.stan.domain.User;
import com.stan.exception.UserBlockedException;
import com.stan.rm.UserRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

/**
 *
 * @author IFM-COMPLIANCE
 */
@Service
public class UserServiceImp extends BaseDAO implements UserService{
    
    @Autowired
    private UserDao userDao;
    
    @Override
    public void register(User u) {
        userDao.save(u);
    }

    @Override
    public User loggin(String userName, String password) throws UserBlockedException {
          String query = "select userid, name, phone, email, address, loginName, role, loginStatus"
                + " FROM users where loginName = :ln AND password = :pass";
          Map m = new HashMap();
          m.put("ln", userName);
          m.put("pass", password);
          //ParameterSource p = SqlParameterSource();
          try{
          User u = getNamedParameterJdbcTemplate().queryForObject(query, m, new UserRowMapper());
           if(u.getLoginStatus().equals(UserService.LOGIN_STATUS_BLOCKED))
           {
            throw new UserBlockedException("Your account has been blocked, see admin"); 
           }
           else
           {
          return u;
           }
          }
          catch(EmptyResultDataAccessException e){
              return null;
          }
    }
    

    @Override
    public List<User> getUserList() {
       return userDao.findProp("role", UserService.ROLE_USER);
    }

    @Override
    public void changeLoginStatus(Integer userId, Integer loginStatus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
