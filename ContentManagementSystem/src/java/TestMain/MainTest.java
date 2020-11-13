/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMain;

import com.stan.dao.CustomerDao;
import com.stan.domain.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author IFM-COMPLIANCE
 */
@Repository
@Component
public class MainTest {
   
    @Autowired
    CustomerDao dao;
    
    public void you()
    {
      List<Customer> cust = dao.findCust(1, "stan");
      System.out.println(cust);
    }
    
    
    
    public static void main(String[] arg)
    {
        //ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("web.xml");
        //CustomerDao cdao = ac.getBean(CustomerDao.class);
        
     MainTest  m = new MainTest();
     //Customer cust =m.dao.findCust(1, "stan");
     //System.out.println(cust);
     m.you();
    }
    
}
