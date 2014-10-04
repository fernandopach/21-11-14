/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.maven.mvc;

import com.mycompany.maven.mvc.nomina;
import com.bmycmavenmvctroller.Trabajador;

/**
 *
 * @author T
 */
public class TestTodo {
    public static void main(String args[]){
        //primero creamos un trabajador 
        Trabajador t=new Trabajador(1, "Sandra", 40,200);
        nomina n=new nomina (t);
        n.pagarNomina();
        
    }
    
}
