/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.aops;

//import java.util.logging.Logger;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author IFM-COMPLIANCE
 */
@Aspect
@Component
public class AspectClass {
    
    //set up our logger
   private Logger myLogger = Logger.getLogger(getClass().getName());
    
    //set up our pointcut declaretions
    @Pointcut("execution(* com.stan.dao.*.*())")
    public void daoLink()
    {}
    
    @Pointcut("execution(* com.stan.service.*.*())")
    public void serviceLink()
    {}
    
    @Pointcut("execution(* com.stan.controller.*.*())")
    public void controllerLink()
    {}
    
    @Pointcut("daoLink() || serviceLink() || controllerLink()")
    public void link()
    {}
    
    @Before("link()")
    public void before(JoinPoint thejoin)
    {
       String theMethod = thejoin.getSignature().toString();
       myLogger.info("Message Logged at: "+theMethod);
       //System.out.println("Running Aspect");
       //JOptionPane.showMessageDialog(null, myLogger);
    }
}
