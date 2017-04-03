
package com.iescomercio.tema8.abstracto;

public class Cuadrado extends Figura{
    
    private float lado;

    @Override
    public float calcularArea() {
        return lado * lado;
    }

    @Override
    public float calcularPerimetro() {
        return lado * 4;
    }
    
}
