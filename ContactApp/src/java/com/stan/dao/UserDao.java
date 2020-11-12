/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.dao;

import com.stan.domain.User;
import java.util.List;

/**
 *
 * @author IFM-COMPLIANCE
 */

public interface UserDao 
   {
    public void save(User u);
    public void update(User u);
    public void delete(Integer userId);
    public void delete(User u);
    public User findById(Integer userId);
    public List<User> findAll();
    public List<User> findProp(String propName, Object propVal);
    }
