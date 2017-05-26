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
public class Velero extends Barco{
    private int mastiles;

    public Velero(int mastiles, String matricula, float eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    @Override
    public float precioAmarreDia() {
        return super.precioAmarreDia() + mastiles * 5;
    }
    
}
