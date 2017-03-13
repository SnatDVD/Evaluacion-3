
package com.iescomercio.tema7.figuras;

public class Main {

    public static void main(String[] args) {
        
        Circulo c = new Circulo(3.2);
        
        Triangulo t = new Triangulo(2.6, 4.1, 3.2, 2.5);
        
        Cuadrado cu = new Cuadrado(5.8);
        
        Figura f = new Figura();
        
        Matematico m = new Matematico();
        
        System.out.println(m.averiguaArea(c));
        System.out.println(m.averiguaPerimetro(c));
        
        System.out.println(m.averiguaArea(t));
        System.out.println(m.averiguaPerimetro(t));
        
        System.out.println(m.averiguaArea(cu));
        System.out.println(m.averiguaPerimetro(cu));
        
        System.out.println(m.averiguaArea(f));
        System.out.println(m.averiguaPerimetro(f));
        
    }
    
}
