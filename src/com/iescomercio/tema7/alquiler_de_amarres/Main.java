
package com.iescomercio.tema7.alquiler_de_amarres;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        
        Yate y = new Yate(100, "1256DRL", 25, 1998, 3);
        Velero v = new Velero(4, "4312TPG", 15, 1991);
        
        System.out.println(y.calcularAlquilerPorDia());
        
        GregorianCalendar f1 = new GregorianCalendar(2016, 6, 24);
        GregorianCalendar f2 = new GregorianCalendar(2016, 8, 13);
        Alquiler a = new Alquiler("Paco", "16642124Z", f1, f2, "N-236", y);
        Alquiler a2 = new Alquiler("Paco", "16642124Z", f1, f2, "N-236", v);
        
        System.out.println(a.calcularAlquiler());
        System.out.println(a2.calcularAlquiler());
        
    }
    
}
