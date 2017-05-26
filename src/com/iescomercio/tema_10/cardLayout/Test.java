/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema_10.cardLayout;

import java.util.GregorianCalendar;

/**
 *
 * @author Vespertino
 */
public class Test {
    public static void main(String[] args) {
        Velero v = new Velero(2, "ASD2345", 5, 2000);
        EmbarcacionDeportiva e = new EmbarcacionDeportiva(50, "ASD5345", 2);
        e.setAñoFabricacion(2005);        
        Yate y = new Yate(60, 5, "BSD2345", 10, 2008);
        Barco b = new Barco("df344", 2.3F, 2007);
        Catamaran ct = new Catamaran("BDS34324", 6.5F, 1920, 2);
        ct.setnumeroDePatines(3);
        
        GregorianCalendar g = new GregorianCalendar(2000, 4, 12);
        GregorianCalendar g1 = new GregorianCalendar(2000, 6, 12);
        GregorianCalendar g2 = new GregorianCalendar(2001, 6, 22);
        GregorianCalendar g3 = new GregorianCalendar(2001, 9, 32);
        GregorianCalendar g4 = new GregorianCalendar(2005, 7, 12);
        GregorianCalendar g5 = new GregorianCalendar(2005, 12, 32);
        
        Cliente c1= new Cliente("20302394R", "Juan Lopez", "941332321");
        Cliente c2= new Cliente("54322344L", "Pedro Garcia", "941322233");
        Cliente c3= new Cliente("23453214X", "Luisa Pérez", "62533232");
        Cliente c4= new Cliente("33222100G", "Maria Sorolla", "64333443");
        Cliente c5= new Cliente("32323222F", "Eduardo Saéz", "67678974");
        
        Alquiler a = new Alquiler(c1, g,  v);
        a.setFinalAlquiler(g1);
        a.setPosicion(4);
        Alquiler a1 = new Alquiler(c2, g2,  e);
        a1.setFinalAlquiler(g3);
        a1.setPosicion(5);
        Alquiler a2 = new Alquiler(c3, g4,  y);
        a2.setFinalAlquiler(g5);
        a2.setPosicion(6);
        Alquiler a3 = new Alquiler(c4, g, b);
        a3.setFinalAlquiler(g1);
        a3.setPosicion(7);
        Alquiler a4 = new Alquiler(c5, g2,ct);
        a4.setFinalAlquiler(g3);
        a4.setPosicion(8);
                
        System.out.println("El alquiler del velero es de: " + a.calcularAlquilerEstancia());
        System.out.println("El alquiler de la enbarcacion a motor es de: " + a1.calcularAlquilerEstancia());
        System.out.println("El alquiler del yate es de: " + a2.calcularAlquilerEstancia());
        System.out.println("El alquiler de un barco común es de: " + a3.calcularAlquilerEstancia());
        System.out.println("El alquiler del catamaran es de: " + a4.calcularAlquilerEstancia());
    }
    
}
