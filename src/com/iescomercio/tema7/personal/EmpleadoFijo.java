
package com.iescomercio.tema7.personal;

import java.time.Year;
import java.util.GregorianCalendar;

public class EmpleadoFijo extends Empleado{
    
    protected int annoAlta;
    private static double complemento = 20;

    public EmpleadoFijo(int annoAlta, String nif, String nombre, int edad) {
        super(nif, nombre, edad);
        this.annoAlta = annoAlta;
    }

    public static double getComplemento() {
        return complemento;
    }

    public static void setComplemento(double complemento) {
        EmpleadoFijo.complemento = complemento;
    }
    
    @Override
    public double calculaSueldo(){
        return (Year.now().getValue() - annoAlta) * getComplemento() + smi;
    }
    
}
