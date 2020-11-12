/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.controller;

import com.stan.domain.Contact;
import com.stan.service.ContactService;
import java.util.List;
import javax.servlet.http.HttpSession;
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
public class ContactController {
   
    @Autowired
    ContactService contactService;
    
    @RequestMapping("/cRF")
    public String cRegForm(Model model)
    {
        Contact contact = new Contact();
        model.addAttribute("command", contact);
        return "contactRegistration";
    }
    
    @RequestMapping("/cList")
    public String saveOrUpdate(@ModelAttribute("command") Contact cont, Model model, HttpSession session)
    {
        Integer cid = (Integer)session.getAttribute("aContactId");
        if(cid==null)
          {
            try{Integer userid = (Integer)session.getAttribute("userid");
            cont.setUserId(userid);
            contactService.save(cont);
           //model.addAttribute("err","Contact Save Successfully");
            return "redirect:cLister?act=sv";
             }
              catch(Exception e)
             {
             e.printStackTrace();
              model.addAttribute("err","Error saving contact. Kindly enter valid data");
              return "contactRegistration";
               }
       }
        else
        {
         try{
             cont.setContactId(cid);
             
        contactService.update(cont);
        //model.addAttribute("err","Contact Save Successfully");
        return "redirect:cLister?act=up";
        }
        catch(Exception e)
        {
         e.printStackTrace();
         model.addAttribute("err","Error Updating contact. Kindly enter valid data"+e.getMessage());
         return "contactRegistration";
        }
        }
    }
    
     @RequestMapping("/cLister")
     public String showContactList(Model model, HttpSession session)
     {
         Integer userid = (Integer)session.getAttribute("userid");
         List<Contact> c ;
         c=contactService.findUserContact(userid);
         model.addAttribute("contactList", c);
        return "contactList";
    }
     
      
     
     @RequestMapping("/freetext")
     public String contactSearch(Model model, HttpSession session, @RequestParam("freetext") String text)
     {
         Integer userid = (Integer)session.getAttribute("userid");
         
         model.addAttribute("contactList", contactService.findUserContact(userid, text));
         
        return "contactList";
    }
      
     @RequestMapping("/delete")
    public String showDelete(@RequestParam("cid") Integer contactId)
     {
         contactService.delete(contactId);
         return "redirect:cLister";
    }
    
    @RequestMapping("/bulkDelete")
    public String showBulkDelete(@RequestParam("cid") Integer[] contactId)
     {
         contactService.delete(contactId);
         return "redirect:cLister?act=bk";
    }

    
     @RequestMapping("/update")
    public String showUpdate(@RequestParam("cid") Integer contactId, HttpSession session, Model model)
     {
         session.setAttribute("aContactId", contactId);
         Contact contact = contactService.findById(contactId);
         model.addAttribute("command", contact);
         return "contactRegistration";
    }


}
     

    

