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
public class MainCUpdate {
    public static void main(String[] arg)
    {
    ApplicationContext ap = new AnnotationConfigApplicationContext(SpringRootConfig.class);
      ContactDao cd = ap.getBean(ContactDao.class);
      Contact c = new Contact();
      c.setContactId(2);
      c.setUserId(2);
      c.setName("Edites");
      c.setPhone("090876599");
      c.setEmail("arara.chi@gmail.com");
      c.setAddress("Ibadan");     
      c.setRemark("Ok");
      
      cd.update(c);
      
      System.out.println("Data Updated Successfully");

       
    }
      
      
}
