/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.controller;

import com.stan.command.LoginCommand;
import com.stan.command.UserCommand;
import com.stan.domain.User;
import com.stan.exception.UserBlockedException;
import com.stan.service.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author IFM-COMPLIANCE
 */
@Controller
public class UserController {
    
   @Autowired
   UserService userService; 
    
    @RequestMapping(value={"/","/index"})
    public String showIndex(Model model)
    {
        LoginCommand login = new LoginCommand();
        model.addAttribute("command", login);
        return "index";
    }
    
    @RequestMapping (value="/login")
    public String loginHandler(@ModelAttribute("command") LoginCommand log, Model model, HttpSession session)
    {
        try{
        User loginUser = userService.loggin(log.getLoginName(), log.getPassword());
        
        if(loginUser==null)
        {
            //Failed Path
           model.addAttribute("err", "Invalid account");
          return "userLogin";
        }
        else{
            //Success Path
           if(loginUser.getRole().equals(UserService.ROLE_ADMIN)){
               //add logged in user to session scope
               addUsertoSession(loginUser, session);
               
               return "redirect:adminDashboard";
           }
           else if(loginUser.getRole().equals(UserService.ROLE_USER))
                   {
                        //add logged in user to session scope
                        addUsertoSession(loginUser, session);
                       return "redirect:userDashboard";
                   }
           else{
              model.addAttribute("err", "Invalid role");
              return "userLogin";
             }
        }
        }
        catch(UserBlockedException u)
        {
          model.addAttribute("err", u.getMessage());
          return "index";
        }
    }
    
    @RequestMapping("/userDashboard")
    public String showUserDashboard()
    {
      return "userDashBoard";
    }

     @RequestMapping("/adminDashboard")
     public String showAdminDashboard()
     {
      return "adminDashBoard";
     }
     
     @RequestMapping(value={"/logout"})
     public String showLogout(HttpSession session)
     {
         session.invalidate();
         return "redirect:index?act=log";
     }
     
     @RequestMapping(value={"/reg"})
     public String showReg(Model model)
     {
        UserCommand userCommand = new UserCommand();
        model.addAttribute("command", userCommand);
         return "userRegistration";
     }

     @RequestMapping(value={"/reg_proces"})
     public String showRegProcess(@ModelAttribute("command") UserCommand cmd, Model model)
     {
         try{
         User user = cmd.getUserCommand();
         user.setLoginStatus(1);
         user.setRole(2);
         userService.register(user);
        //UserCommand userCommand = new UserCommand();
       // model.addAttribute("command", userCommand);
         return "redirect:index?act=rg";
         }
         catch(DuplicateKeyException e)
         {
           model.addAttribute("err", "User Name already exist, Kindly enter a unique user name.");
           return "userRegistration";
         }
     }


     private void addUsertoSession(User u, HttpSession session)
     {
      session.setAttribute("user", u);
      session.setAttribute("userid", u.getUserId());
      session.setAttribute("role", u.getRole());
     }
     
     @RequestMapping("/uList")
     public String showUserList(Model model)
     {
         model.addAttribute("userList", userService.getUserList() );
        return "userList";
    }
     
      @RequestMapping("/uLog")
     public String showUserLogin(Model model)
     {
        // model.addAttribute("userList", userService.getUserList() );
        //return "userLogin";
        return "index";
    }

}
