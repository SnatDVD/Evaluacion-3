
package com.iescomercio.tema7.alquiler_de_amarres;

public class Barco {
    
    protected String matricula;
    protected double eslora;
    protected int anoFabricacion;
    
    public Barco(){
        matricula = "";
        eslora = 0;
        anoFabricacion = 0;
    }

    public Barco(String matricula, double eslora, int anoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }
    
    public double calcularAlquilerPorDia(){
        return 2 + (eslora * 10);
    }
    
}
