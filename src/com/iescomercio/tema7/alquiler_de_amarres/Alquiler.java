
package com.iescomercio.tema7.alquiler_de_amarres;

import java.util.GregorianCalendar;

public class Alquiler {
    
    private String nombreCliente;
    private String dniCliente;
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaFinal;
    private String posicion;
    private Barco barco;

    public Alquiler(String nombreCliente, String dniCliente, GregorianCalendar fechaInicio, GregorianCalendar fechaFinal, String posicion, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.posicion = posicion;
        this.barco = barco;
    }
    
    private static int numDiasEntreFechas(GregorianCalendar inicio, GregorianCalendar fin){
        long difms = fin.getTimeInMillis() - inicio.getTimeInMillis();
        long difd = difms / (1000 * 60 * 60 * 24);
        return (int)difd;
    }
    
    public double calcularAlquiler(){
        return barco.calcularAlquilerPorDia() * numDiasEntreFechas(fechaInicio, fechaFinal);
    }
    
}
