package com.iescomercio.tema7.punto2d;

/**
 * Clase Punto que representa a un punto en un plano de dos
 * dimensiones.
 * @author David Rodriguez
 */
public class Punto {

    private int x;
    private int y;

    /**
     * Constructor con dos parámetros para crear un Punto con unas
     * coordenadas determinadas.
     * @param x Coordenada X del nuevo punto
     * @param y Coordenada Y del nuevo punto
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor sin parámetros, incializa ambas coordenadas a 0.
     */
    public Punto() {
        this(0, 0);
    }

    /**
     * Contructor con un solo parametro que será el valor de 
     * la coordenada "x".
     * La coordenada "y" la inicia a 1.
     * 
     * @param x Coordenada X del nuevo punto
     */
    public Punto(int x) {
        this(x, 1);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     *
     * @return Devuelve una cadena con los valores de las coordenadas
     */
    @Override
    public String toString() {
        return "X: " + x + " / Y: " + y;
    }

    /**
     * Compara dos puntos para saber si sus coordenadas son las mismas.
     * @param p Punto que se quiera comparar
     * @return Devuelve true si las coordenadas de ambos puntos son iguales.
     * Devuelve falso en caso contrario.
     */
    @Override
    public boolean equals(Object p) {
        Punto punto = (Punto)p;
        return (punto.getX() == this.getX() && punto.getY() == this.getY());
    }

    /**
     * Metodo que averigua el valor mayor entre sus coordenadas.
     * @return Devuelve la mayor de las coordenadas del punto.
     */
    public int equals() {
        if(x > y){
            return x;
        } else {
            return y;
        }
    }
}
