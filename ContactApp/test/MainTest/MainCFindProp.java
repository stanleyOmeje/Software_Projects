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
public class MainCFindProp {
    
public static void main(String[] arg)
{
      ApplicationContext ap = new AnnotationConfigApplicationContext(SpringRootConfig.class);
      ContactDao cd = ap.getBean(ContactDao.class);
      List<Contact> c = cd.findProp("name","Nneoma");
     System.out.println("-------------Your result is as follows------------");
     for(Contact c1:c){
     System.out.println(c1.getContactId()+" "+c1.getUserId()+" "+c1.getName()+" "+c1.getPhone()+" "+c1.getEmail()+
             " "+c1.getAddress()+" "+c1.getRemark());
     
    }
}
}
