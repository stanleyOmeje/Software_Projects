/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTest;

import com.stan.config.SpringRootConfig;
import com.stan.dao.UserDao;
import com.stan.domain.Contact;
import com.stan.domain.User;
import com.stan.service.UserService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class MainSSave {
    public static void main(String[] arg)
    {
    ApplicationContext ap = new AnnotationConfigApplicationContext(SpringRootConfig.class);
      UserService us = ap.getBean(UserService.class);
      User u = new User();
      u.setName("Ego");
      u.setPhone("090876599");
      u.setEmail("ayo@gmail.com");
      u.setAddress("Ibadan");
      u.setLoginName("Marax");
      u.setPassword("presbobo");
      u.setRole(UserService.ROLE_USER);
      u.setLoginStatus(UserService.LOGIN_STATUS_ACTIVE);
      us.register(u);
      
      System.out.println("User Registered Successfully");
       
    }
      
      
}
