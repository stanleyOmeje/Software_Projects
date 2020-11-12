/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTest;

import com.stan.config.SpringRootConfig;
import com.stan.dao.ContactDao;
import com.stan.service.ContactService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class MainCSDeletes {
    public static void main(String[] arg)
    {
     ApplicationContext ap = new AnnotationConfigApplicationContext(SpringRootConfig.class);
     ContactService cs = ap.getBean(ContactService.class);
     Integer[] a = {5,6};
     cs.delete(a);
     System.out.println("Contacts Deleted Successfully");
    }
    
}
