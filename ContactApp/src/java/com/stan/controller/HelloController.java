/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author IFM-COMPLIANCE
 */
@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    @ResponseBody
    public String showHello()
    {
        Date d = new Date();
        
      return d.toString();// "";
    }
}
