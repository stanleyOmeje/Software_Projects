/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class MainTest {
    public static void main(String[] arg)
    {
      String url="jdbc:mysql://localhost:3306/cms";
      String user = "stan";
      String pass = "stan";
      
      try{
       System.out.println("Establishing Connection...");  
      
      Connection con = DriverManager.getConnection(url, user,pass);
      System.out.println("Connection Established..."); 
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
    }
    
}
