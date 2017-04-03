
package com.iescomercio.tema8.abstracto;

public class Triangulo  extends Figura{

    private float lado1;
    private float lado2;
    private float base;
    private float altura;
    
    @Override
    public float calcularArea() {
        return base * altura / 2;
    }

    @Override
    public float calcularPerimetro() {
        return base + lado1 + lado2;
    }
    
}
