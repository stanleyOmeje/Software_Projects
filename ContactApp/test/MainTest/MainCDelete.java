/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTest;

import com.stan.config.SpringRootConfig;
import com.stan.dao.ContactDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class MainCDelete {
    public static void main(String[] arg)
    {
     ApplicationContext ap = new AnnotationConfigApplicationContext(SpringRootConfig.class);
     ContactDao cd = ap.getBean(ContactDao.class);
     cd.delete(2);
     System.out.println("Contact Deleted Successfully");
    }
    
}
