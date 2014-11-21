/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.mvc;

/**
 *
 * @author T107
 */
public class Clientes {
    private int edad;
    private String direccion;
    private String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clientes() {
    }

    public Clientes(int edad, String direccion, String nombre) {
        this.edad = edad;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Clientes{" + "edad=" + edad + ", direccion=" + direccion + ", nombre=" + nombre + '}';
    }
    
    
}