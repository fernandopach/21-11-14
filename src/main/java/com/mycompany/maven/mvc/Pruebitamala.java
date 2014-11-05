/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.maven.mvc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

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
       SessionFactory sesion= UtilidadesHibernate.getSessionFactory();
       //abrir la sesion
       Session ses= sesion.openSession();
       //importantisimo empezar la sesion
       Transaction t=ses.beginTransaction();
       //Viene lo bueno,hacer la operacion
            Trabajador uno=(Trabajador) ses.createCriteria(Trabajador.class).add(Restrictions.idEq(1)).uniqueResult();
          //paso 2   ses.delete(new Trabajador(2,"rata", "de", "dos patas"));
          t.commit();
          ses.close();
      
       
    }
    
}
