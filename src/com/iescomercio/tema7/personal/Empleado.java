
package com.iescomercio.tema7.personal;

public class Empleado {
    
    protected String nif;
    protected String nombre;
    protected int edad;
    protected static double smi = 580;

    public Empleado(String nif, String nombre, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "NIF: " + nif + " Nombre: " + nombre + " Edad: " + edad;
    }
    
    public double calculaSueldo(){
        return smi;
    }
    
}
