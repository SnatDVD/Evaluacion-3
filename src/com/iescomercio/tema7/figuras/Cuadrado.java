
package com.iescomercio.tema7.figuras;

public class Cuadrado extends Figura{
    
    private double lado;
    
    public Cuadrado(double longLado){
        lado = longLado;
    }
    
    @Override
    public double calcularArea(){
        return lado * lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return lado * 4;
    }
}
