
package com.iescomercio.tema7.personal;

public class EmpleadoPorHoras extends Empleado{
    
    protected double precioHora;
    protected int horasTrabajadasMes;

    public EmpleadoPorHoras(double precioHora, int horasTrabajadasMes, String nif, String nombre, int edad) {
        super(nif, nombre, edad);
        this.precioHora = precioHora;
        this.horasTrabajadasMes = horasTrabajadasMes;
    }
    
    @Override
    public double calculaSueldo(){
        return (precioHora * horasTrabajadasMes) + smi;
    }
    
    
}
