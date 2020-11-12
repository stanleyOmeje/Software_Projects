/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.util;

/**
 *
 * @author IFM-COMPLIANCE
 */
public class CommaSeperatedList {
    
    public static String getList(Object[] obj)
    {
     StringBuffer buf = new StringBuffer();
     for(Object o : obj)
     {
       buf.append(o).append(",");
     }
     if(buf.length()>0)
     {
         buf.deleteCharAt(buf.length()-1);
     }
     return buf.toString();
    }
    
}
