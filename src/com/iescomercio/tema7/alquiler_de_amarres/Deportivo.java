
package com.iescomercio.tema7.alquiler_de_amarres;

public class Deportivo extends Barco{
    
    private int potencia;

    public Deportivo(int potencia, String matricula, double eslora, int anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.potencia = potencia;
    }
    
    @Override
    public double calcularAlquilerPorDia(){
        return super.calcularAlquilerPorDia() + potencia;
    }
    
}
