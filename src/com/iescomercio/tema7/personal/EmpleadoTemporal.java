
package com.iescomercio.tema7.personal;

import java.util.GregorianCalendar;

public class EmpleadoTemporal extends Empleado{
    
    protected GregorianCalendar fechaAlta;
    protected GregorianCalendar fechaBaja;

    public EmpleadoTemporal(GregorianCalendar fechaAlta, GregorianCalendar fechaBaja, String nif, String nombre, int edad) {
        super(nif, nombre, edad);
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }
    
    @Override
    public double calculaSueldo(){
        return smi;
    }
    
}
