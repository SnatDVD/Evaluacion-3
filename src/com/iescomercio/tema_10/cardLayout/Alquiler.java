/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema_10.cardLayout;

import java.util.GregorianCalendar;
 
/**
 *
 * @author Vespertino
 */
public class Alquiler {
    private Cliente cliente;
    private GregorianCalendar fechaInicial;
    private GregorianCalendar finalAlquiler;
    private int posicion;
    private Barco barco;

    public Alquiler(Cliente cli, GregorianCalendar fechaInicial, Barco barco) {
        this.cliente = cli;
        this.fechaInicial = fechaInicial;
        this.finalAlquiler = new GregorianCalendar();
        this.posicion = 0;
        this.barco = barco;
    }

    public void setFinalAlquiler(GregorianCalendar finalAlquiler) {
        this.finalAlquiler = finalAlquiler;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    
    
    private int numeroDeDias() {
        long dif = finalAlquiler.getTimeInMillis() - fechaInicial.getTimeInMillis();
        int diferencia = (int)(dif / (1000 * 60 * 60 * 24));
        
        return diferencia;
    }
    
    public float calcularAlquilerEstancia() {        
        float fin;
        //********************************************
        fin = numeroDeDias() * barco.precioAmarreDia();
        //********************************************
        return fin;
    }
            
    
}
