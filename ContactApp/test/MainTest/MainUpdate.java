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

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class MainUpdate {
    public static void main(String[] arg)
    {
    ApplicationContext ap = new AnnotationConfigApplicationContext(SpringRootConfig.class);
      UserDao ud = ap.getBean(UserDao.class);
      User u = new User();
      u.setUserId(11);
      u.setName("Ibukun");
      u.setPhone("090876599");
      u.setEmail("nk.chi@gmail.com");
      u.setAddress("Lagos");     
      u.setRole(2);
      u.setLoginStatus(1);
      
      ud.update(u);
      
      System.out.println("Data Updated Successfully");

       
    }
      
      
}
