/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema_10.cardLayout;

/**
 *
 * @author Vespertino
 */
public class EmbarcacionDeportiva extends Barco{
    private int cv;

    public EmbarcacionDeportiva(int cv, String matricula, float eslora) {
        super(matricula, eslora, 0);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
    
    
    @Override
    public float precioAmarreDia() {
        return super.precioAmarreDia() +  cv;
    }
}
