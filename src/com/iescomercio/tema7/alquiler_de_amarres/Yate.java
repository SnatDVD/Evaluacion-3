
package com.iescomercio.tema7.alquiler_de_amarres;

public class Yate extends Deportivo{
    
    private int numCamarotes;

    public Yate(int potencia, String matricula, double eslora, int anoFabricacion, int numCamarotes) {
        super(potencia, matricula, eslora, anoFabricacion);
        this.numCamarotes = numCamarotes;
    }
    
    @Override
    public double calcularAlquilerPorDia(){
        return super.calcularAlquilerPorDia() + (numCamarotes * 20);
    }
    
}
