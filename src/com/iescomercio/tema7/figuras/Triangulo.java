
package com.iescomercio.tema7.figuras;

public class Triangulo extends Figura{
    
    private double base;
    private double lado1;
    private double lado2;
    private double altura;
    
    public Triangulo(double base, double lado1, double lado2, double altura){
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }
    
    @Override
    public double calcularPerimetro(){
        return base + lado1 + lado2;
    }
}
