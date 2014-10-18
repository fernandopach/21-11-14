/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.maven.mvc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T
 */
public class Pruebitamala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //pasos para la transaccion
       SessionFactory factory= UtilidadesHibernate.getSessionFactory();
       //abrir la sesion
       Session sesion= factory.openSession();
       //importantisimo empezar la sesion
       Transaction t= sesion.beginTransaction();
       //Viene lo bueno,hacer la operacion
      sesion.save(new Trabajador("brenda","garcia","flores"));
      //el siguiente renglon libera el candado
      t.commit();
      //finalmente cerramos el session factory
      factory.close();
      
       
    }
    
}
