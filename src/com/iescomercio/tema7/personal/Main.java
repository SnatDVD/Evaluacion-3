
package com.iescomercio.tema7.personal;

public class Main {

    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("16642124", "Pepito", 31);
        System.out.println(e1.toString());
        System.out.println(e1.calculaSueldo());
        
        
    }
    
}
