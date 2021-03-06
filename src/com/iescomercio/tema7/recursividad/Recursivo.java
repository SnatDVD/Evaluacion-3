
package com.iescomercio.tema7.recursividad;

import java.util.Arrays;

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
    
    public static void toBinaryRecursivo(int num){
        if(num < 2){
            System.out.print(num);
        } else {
            toBinaryRecursivo(num / 2);
            System.out.print(num % 2);
        }
    }
    
    public static void toBinaryIterativo(int num){
        int aux = num;
        String resultado = "";
        
        while (aux > 1){
            if(aux % 2 == 1){
                resultado = "1" + resultado;
            } else {
                resultado = "0" + resultado;
            }
            aux = aux / 2;
        }
        if(aux == 1){
            resultado = "1" + resultado;
        } else if(aux == 0){
            resultado = "0" + resultado;
        }
        System.out.println(resultado);
    }
    
    public static int sumaArrayRecursivo(int[] numeros){
        if(numeros.length == 1){
            return numeros[0];
        } else {
            int[] aux = Arrays.copyOf(numeros, numeros.length - 1);
            return numeros[numeros.length - 1] + sumaArrayRecursivo(aux);
        }
    }
    
    public static int sumaArrayIterativo(int[] numeros){
        int suma = 0;
        for(int c = 0; c < numeros.length; c++){
            suma = suma + numeros[c];
        }
        return suma;
    }
    
    public static int minValorArray(int[] numeros){
        if(numeros.length == 1){
            return numeros[0];
        } else {
            int[] aux = Arrays.copyOf(numeros, numeros.length - 1);
            if (numeros[0] > numeros[numeros.length - 1]){
                aux[0] = numeros[numeros.length - 1];
            }
            return minValorArray(aux);
        }
    }
    
    public static int maxValorArray(int[] numeros){
        if(numeros.length == 1){
            return numeros[0];
        } else {
            int[] aux = Arrays.copyOf(numeros, numeros.length - 1);
            if (numeros[0] < numeros[numeros.length - 1]){
                aux[0] = numeros[numeros.length - 1];
            }
            return maxValorArray(aux);
        }
    }
    
    public static int[] maxYMinArray(int[] numeros){
        int[] aux = new int[2];
        aux[0] = maxValorArray(numeros);
        aux[1] = minValorArray(numeros);
        return aux;
    }
    
}
