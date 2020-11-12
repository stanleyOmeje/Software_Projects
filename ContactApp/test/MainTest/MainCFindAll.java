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
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class MainCFindAll {
    
public static void main(String[] arg)
{
      ApplicationContext ap = new AnnotationConfigApplicationContext(SpringRootConfig.class);
      ContactDao cd = ap.getBean(ContactDao.class);
      List<Contact> c = cd.findAll();
     System.out.println("-------------Your result is as follows------------");
     for(Contact u1:c){
     System.out.println(u1.getContactId()+" "+u1.getUserId()+" "+u1.getName()+" "+u1.getPhone()+" "+u1.getEmail()+
             " "+u1.getAddress()+" "+u1.getRemark());
     
    }
}
}
