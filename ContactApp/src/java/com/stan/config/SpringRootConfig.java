/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author IFM-COMPLIANCE
 */
@Configuration
@ComponentScan(basePackages={"com.stan.dao","com.stan.service"})
public class SpringRootConfig {
    
    @Bean
 public DriverManagerDataSource getDataSource()
 {
  DriverManagerDataSource ds = new DriverManagerDataSource();
  ds.setDriverClassName("com.mysql.jdbc.Driver");
  ds.setUrl("jdbc:mysql://localhost:3306/capp_db");
  ds.setUsername("stan");
  ds.setPassword("stan");
  return ds;
 }

}
