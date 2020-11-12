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
import com.stan.service.ContactService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class MainCSUpdate {
    public static void main(String[] arg)
    {
    ApplicationContext ap = new AnnotationConfigApplicationContext(SpringRootConfig.class);
      ContactService cs = ap.getBean(ContactService.class);
      Contact c = new Contact();
      c.setContactId(3);
      c.setUserId(3);
      c.setName("Temitope");
      c.setPhone("090876599");
      c.setEmail("temi.chi@gmail.com");
      c.setAddress("Ibadan");     
      c.setRemark("Ok");
      
      cs.update(c);
      
      System.out.println("Data Updated Successfully");

       
    }
      
      
}
