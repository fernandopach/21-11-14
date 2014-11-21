/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.mvc;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T107
 */
public class DAOUsuarioImpl { 
      
 private static final Logger log = Logger.getAnonymousLogger(); 
 private static final ThreadLocal session = new ThreadLocal(); 
 
 
 private static final SessionFactory sessionFactory = HIbernateUtilidades.getSessionFactory(); 
         
 public DAOUsuarioImpl() {  
     public String obtenerTodos() throws Exception{
        SessionFactory factory= HIbernateUtilidades.getSessionFactory(); 
    Session sesion=    factory.openSession(); 
   Transaction tranza= sesion.beginTransaction(); 
  
 Criteria cri=sesion.createCriteria(Usuario.class); 
 ArrayList<Usuario> usuarios= (ArrayList<Usuario>)cri.list(); 

 
 ObjectMapper mapper=new ObjectMapper(); 


 
 
 
   
   tranza.commit(); 
   sesion.close(); 
   
  return mapper.writeValueAsString(usuarios); 
    } 
      
 } 

     
 } 
                     
