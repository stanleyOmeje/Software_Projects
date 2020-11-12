/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTest;

import com.stan.config.SpringRootConfig;
import com.stan.dao.ContactDao;
import com.stan.dao.UserDao;
import com.stan.domain.Contact;
import com.stan.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class MainCFind {
    
public static void main(String[] arg)
{
      ApplicationContext ap = new AnnotationConfigApplicationContext(SpringRootConfig.class);
      ContactDao cd = ap.getBean(ContactDao.class);
      Contact c = cd.findById(1);
     System.out.println("-------------Your result is as follows------------");
     System.out.println(c.getContactId());
     System.out.println(c.getUserId());
     System.out.println(c.getName());
     System.out.println(c.getPhone());
     System.out.println(c.getEmail());
     System.out.println(c.getAddress());
     System.out.println(c.getRemark());
         }
}
