
package com.iescomercio.tema7.dome_v2;

public class Main {

    public static void main(String[] args) {
        Database d = new Database();
        CD cd = new CD("DO WHILE", "Manuel", 10, 50);
        CD cd2 = new CD("Tonto el que lo lea", "Chiqui",1, 15);
        d.addItem(cd);
        d.addItem(cd2);
        d.list();
        
    }
    
}
