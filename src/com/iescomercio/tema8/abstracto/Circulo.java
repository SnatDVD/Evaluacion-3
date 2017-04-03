
package com.iescomercio.tema8.abstracto;

public class Circulo extends Figura{
    
    private float radio;
    
    @Override
    public float calcularArea() {
        return (float) (Math.PI * radio * radio);
    }

    @Override
    public float calcularPerimetro() {
        return (float) (4 * Math.PI * radio);
    }
    
    
    
}
