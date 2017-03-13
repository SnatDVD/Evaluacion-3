
package com.iescomercio.tema7.figuras;

public class Circulo extends Figura{
    
    public static final double pi = 3.141592;
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
 
    @Override
    public double calcularArea(){
        return pi * radio * radio;
    }
    
    @Override
    public double calcularPerimetro(){
        return 2 * pi * radio;
    }
}
