/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oss.webbackend.config;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 *
 * @author g.kabardis
 */

/*
h Βαζεις @Configuration στην class  και @bean στην μεθοδο
h Βαζεις  @Component στην  class
 */
@Configuration
//@Component
public class OpswTransManager
{

  @Bean
  public EntityManager getEntityManager()
  {
    return entityManager;
  }
  

  @PersistenceContext
  private EntityManager entityManager; 
  
}
