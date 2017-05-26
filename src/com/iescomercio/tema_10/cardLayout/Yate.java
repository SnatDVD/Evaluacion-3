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
public class Yate extends EmbarcacionDeportiva{
    private int camarotes;

    public Yate(int cv, int camarotes, String matricula, float eslora, int añoFabricacion) {
        super(cv, matricula, eslora);        
        this.camarotes = camarotes;
        setAñoFabricacion(0);
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
           
    @Override
    public float precioAmarreDia() {
        return super.precioAmarreDia() + (camarotes * 20);
        
    }
    
}
