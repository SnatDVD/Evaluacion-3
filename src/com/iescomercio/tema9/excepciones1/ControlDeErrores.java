
package com.iescomercio.tema9.excepciones1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlDeErrores {
    
    public String metodo1(int dividendo, int divisor){
        
        if(divisor != 0){
            return "Cociente = " + dividendo/divisor + " Resto = " + dividendo%divisor;
        } else {
            System.out.println("ERROR");
            return "";
        }
    }
    
    public String metodo2(int dividendo, int divisor){
        
        try {
            return "Cociente = " + dividendo/divisor + " Resto = " + dividendo%divisor;
        } catch(Exception c){
            System.out.println("ERROR");
            return "";
        }
    }
    
    private static void rellenaLista(LinkedList lista){
        
        Random generador = new Random();
        
        for(int c = 0; c < 100; c++){
            lista.add(generador.nextInt(1000));
        }
    }
    
    public Integer metodo3(int indice){
        
        try {
            LinkedList<Integer> lista = new LinkedList();
            
            rellenaLista(lista);
            return lista.get(indice);
        } catch(Exception c) {
            System.out.println("Error; el índice está fuera de rango");
            return 0;
        }
    }
    
    public void metodo4(){
        
        File f = null;
        FileInputStream fis = null;
        
        try {
            f = new File("txt/test.txt");
            fis = new FileInputStream(f);
        } catch (FileNotFoundException c) {
            System.out.println("ERROR: Archivo no encontrado");
        }
        finally {
            try {
                fis.close();
            } catch(IOException c){
                System.out.println("ERROR: No se ha podido cerrar el archivo");
            }
        }
    }
    
     public Integer metodo5(int indice){

        LinkedList<Integer> lista = new LinkedList();

        rellenaLista(lista);
        return lista.get(indice);
    }
    
    
     
}
