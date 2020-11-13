/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMain;

import com.stan.controller.*;
import com.stan.dao.CustomerDao;
import com.stan.domain.Customer;
import com.stan.service.CustomerService;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author IFM-COMPLIANCE
 */
@Controller
public class CustomerControllers {
    //JOptionPane 
    
    @Autowired
   private CustomerService customerService;
    
    @RequestMapping("/")
    public String showIndex()
    {
      return "index";
    }
    
    @RequestMapping("/list")
    public String showList(Model model)
    {
        List<Customer> customers = customerService.listCustomer();
        model.addAttribute("customer", customers);
        return "customerList";
    }
    
     @RequestMapping("/register")
    public String showRegister(Model model)
    {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
      return "registration";
    }
    
     @RequestMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") Customer cust, Model model)
    {
      customerService.saveCustomer(cust);
      return "redirect:list";
    }

     @RequestMapping("/update")
    public String updateCustomer(@RequestParam("cid") int cid, Model model)
    {
      Customer customer = customerService.getCustomer(cid);
      model.addAttribute("customer", customer);
      return "registration";
    }
    
     @RequestMapping("/delete")
    public String deleteCustomer(@RequestParam("cid") int cids, Model model)
    {
     // JOptionPane.showMessageDialog(null, "Hi");
        
    //int stat = JOptionPane.showConfirmDialog(null, "Are you sure You really want to delete Customer");
     //Customer customer = customerService.getCustomer(cid);
      /*if(stat==JOptionPane.NO_OPTION)
      {
       return ;//"redirect:list";
      }*/
      //else
      //{
     customerService.deleteCustomer(cids);
     // model.addAttribute("customer", customer);
     // return "redirect:list";
    
        return "redirect:list";
      //}
    }
    
     @RequestMapping("/findt")
    public String findResult(@RequestParam("sval") String sname,Model model)
   // public String findResult(@RequestParam("cid") int cids, Model model)
    {
     List<Customer> customer = customerService.findCust(sname);
     model.addAttribute("customer", customer);
     // return "redirect:list";
        
        //return "redirect:list";
        return "customerList"; 
    }

}
