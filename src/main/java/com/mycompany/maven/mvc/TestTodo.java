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
public class TestTodo {
    public static void main(String args[]){
        //paso 1 abrir la sesion-factory
        SessionFactory factory= HibernateUtilidades.getSessionFactory();
                  Session sesion= factory.openSession();
                  
                  //empezar una transaccion 
                Transaction tranza=  sesion.beginTransaction();
               
           //ahremos un insert
                Trabajador t=new Trabajador("sandra", "brenda", "garcia");
                sesion.save(t);
                //liberamos la transaccion
                tranza.commit();
                //cerramos la sesion devolvemos la libertad al borrador
                sesion.close();
    }
    
}
