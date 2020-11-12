/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTest;

import com.stan.config.SpringRootConfig;
import com.stan.dao.UserDao;
import com.stan.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class MainFind {
    
public static void main(String[] arg)
{
      ApplicationContext ap = new AnnotationConfigApplicationContext(SpringRootConfig.class);
      UserDao ud = ap.getBean(UserDao.class);
      User u = ud.findById(10);
     System.out.println("-------------Your result is as follows------------");
     System.out.println(u.getUserId());
     System.out.println(u.getName());
     System.out.println(u.getPhone());
     System.out.println(u.getEmail());
     System.out.println(u.getAddress());
      System.out.println(u.getLoginName());
     System.out.println(u.getRole());
     System.out.println(u.getLoginStatus());
     
    }
}
