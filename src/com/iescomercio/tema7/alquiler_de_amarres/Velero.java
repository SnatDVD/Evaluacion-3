
package com.iescomercio.tema7.alquiler_de_amarres;

public class Velero extends Barco{
    
    private int numMastiles;

    public Velero(int numMastiles, String matricula, double eslora, int anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.numMastiles = numMastiles;
    }
    
    @Override
    public double calcularAlquilerPorDia(){
        return super.calcularAlquilerPorDia() + (numMastiles * 5);
    }
    
}
