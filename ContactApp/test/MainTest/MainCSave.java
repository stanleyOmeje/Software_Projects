/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTest;

import com.stan.config.SpringRootConfig;
import com.stan.dao.ContactDao;
import com.stan.domain.Contact;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class MainCSave {
    public static void main(String[] arg)
    {
      ApplicationContext ap = new AnnotationConfigApplicationContext(SpringRootConfig.class);
      ContactDao cd = ap.getBean(ContactDao.class);
      Contact c = new Contact();
      c.setUserId(2);
      c.setName("Nneoma");
      c.setPhone("090876599");
      c.setEmail("uche@gmail.com");
      c.setAddress("Ibadan");
      c.setRemark("Good");
      cd.save(c);
      
      System.out.println("Data Saved Successfully");
    }
    
}
