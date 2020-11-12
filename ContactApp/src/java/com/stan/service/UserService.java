/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.service;

import com.stan.domain.User;
import com.stan.exception.UserBlockedException;
import java.util.List;

/**
 *
 * @author IFM-COMPLIANCE
 */
public interface UserService {
    
    public static final Integer LOGIN_STATUS_ACTIVE= 1;
    public static final Integer LOGIN_STATUS_BLOCKED= 2;
    
    public static final Integer ROLE_ADMIN= 1;
    public static final Integer ROLE_USER= 2;
   
    public void register(User u);
    public User loggin(String userName, String password)throws UserBlockedException;
    public List<User> getUserList();
    public void changeLoginStatus(Integer userId, Integer loginStatus);
}
