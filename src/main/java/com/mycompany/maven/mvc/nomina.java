/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.maven.mvc;

import com.bmycmavenmvctroller.Trabajador;


/**
 *
 * @author T
 */
public class nomina {
    private Trabajador t;

    public nomina(Trabajador t) {
        this.t = t;
    }

    public nomina() {
    }
    
    public float pagarNomina(){
        float pago=t.getHorasTrabajadas()*t.getSueldoBase();
        System.out.println("se pago la nomina de"+t.getNombre()+"por"+pago);
        return pago;
    }
    
}
