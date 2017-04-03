
package com.iescomercio.tema8.abstracto;

public class Matematico {
    
    public double averiguaArea(Figura f){
        return f.calcularArea();
    }
    
    public double averiguaPerimetro(Figura f){
        return f.calcularPerimetro();
    }
}

