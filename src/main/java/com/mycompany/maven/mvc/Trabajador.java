/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bmycmavenmvctroller;

/**
 *
 * @author T
 */
public class Trabajador {
    private int id;
    private String nombre;
    private int horasTrabajadas;
    private float sueldoBase;

    public Trabajador() {
    }

    public Trabajador(int id, String nombre, int horasTrabajadas, float sueldoBase) {
        this.id = id;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoBase = sueldoBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}