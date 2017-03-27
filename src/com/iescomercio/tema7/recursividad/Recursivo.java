
package com.iescomercio.tema7.recursividad;

public class Recursivo {
    
    public static void darVueltaRecursivo(String cadena){
        if(cadena.length() == 1){
            System.out.print(cadena);
        } else {
            System.out.print(cadena.charAt(cadena.length() - 1));
            darVueltaRecursivo(cadena.substring(0, cadena.length() - 1));
        }
    }
    
    public static void darVueltaIterativo(String cadena){
        for(int i = cadena.length() - 1; i >= 0; i--){
            System.out.print(cadena.charAt(i));
        }
    }
    
    public static int sumaRecursivo(String numero){
        if(numero.length() == 1){
            return Integer.parseInt(numero);
        } else {
            return (Integer.parseInt(numero.charAt(0) + "") + 
                    sumaRecursivo(numero.substring(1, numero.length())));
        }
    }
    
    public static int sumaIterativo(String numero){
        int suma = 0;
        for (int i = 0; i < numero.length(); i++){
            suma = suma + Integer.parseInt(numero.charAt(i) + "");
        }
        return suma;
    } 
}
