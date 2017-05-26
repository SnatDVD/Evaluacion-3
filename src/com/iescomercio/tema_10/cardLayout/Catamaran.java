/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema_10.cardLayout;

/**
 *
 * @author David
 */
public class Catamaran extends Velero{
    private int numeroDePatines;
    
    public Catamaran(String matricula, float eslora, int añoFabricacion, int mastiles) {
        super(mastiles, matricula, eslora, añoFabricacion);
        this.numeroDePatines=0;
    }

    public int getnumeroDePatines() {
        return numeroDePatines;
    }

    public void setnumeroDePatines(int numeroDePatines) {
        this.numeroDePatines = numeroDePatines;
    }
    
    @Override
    public float precioAmarreDia() {
        return super.precioAmarreDia() + numeroDePatines*2.5F;
    }
    
}
