
package com.iescomercio.tema9.excepciones1;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;

public class Log {
    
    private LinkedHashMap<GregorianCalendar,String> mapa;
    private String nombre;
    
    public Log(){
        mapa = new LinkedHashMap<GregorianCalendar,String>();
        nombre = "";
    }
    
    public void anadir(String cadena){
        GregorianCalendar tiempo = new GregorianCalendar(Locale.FRANCE);
        mapa.put(tiempo, cadena);
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        aux.append(nombre + "\n");
        
        Set s = mapa.keySet();
        Iterator it = s.iterator();
        
        while(it.hasNext()){
            
        }
        
        return aux.toString();
    }
    
    public void almacenaFichero(){
        
    }
    
    public void leerFichero(){
        
    }
}
