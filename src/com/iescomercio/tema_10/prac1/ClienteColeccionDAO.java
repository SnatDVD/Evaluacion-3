
package com.iescomercio.tema_10.prac1;

import java.util.LinkedHashSet;

public class ClienteColeccionDAO implements InterfazDAO {

    private LinkedHashSet<Cliente> lista;
    private int indice;

    public ClienteColeccionDAO() {
        lista = new LinkedHashSet<Cliente>();
        indice = 0;
    }

    @Override
    public boolean alta(Object o) {
        Cliente aux = (Cliente) o;

        if (!lista.contains(aux)) {
            lista.add(aux);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean baja(Object o) {
        Cliente aux = (Cliente) o;

        if (lista.contains(aux)) {
            lista.remove(aux);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean modificacion(Object viejo, Object nuevo) {
        Cliente nuevoAux = (Cliente) nuevo;
        Cliente viejoAux = (Cliente) viejo;
        Cliente cli;

        if (lista.contains(viejoAux) && !lista.contains(nuevoAux)) {
            Object[] aux = lista.toArray();
            LinkedHashSet<Cliente> listaNueva = new LinkedHashSet();
            
            for(int c = 0; c < aux.length; c++){
                cli = (Cliente) aux[c];
                if(cli.equals(viejoAux)){
                    listaNueva.add(nuevoAux);
                } else {
                    listaNueva.add(cli);
                }
            }
            lista = listaNueva;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object consulta(Object o) {
        Cliente aux = (Cliente) o;

        if (!lista.isEmpty()) {
            for (Cliente c : lista) {
                if (aux.equals(c)) {
                    return c;
                }
            }
        }
        return null;
    }

    @Override
    public Object primero() {
        if (!lista.isEmpty()) {
            Object[] aux = lista.toArray();

            indice = 0;
            return aux[0];
        } else {
            return false;
        }
    }

    @Override
    public Object ultimo() {
        if (!lista.isEmpty()) {
            Object[] aux = lista.toArray();
            
            indice = aux.length - 1;
            return aux[aux.length - 1];
        } else {
            return null;
        }
    }

    @Override
    public Object siguiente(Object o) {
        if(indice < (lista.size()-1)){
            Object[] aux = lista.toArray();
            
            indice++;
            return aux[indice];
        } else {
            return null;
        }
    }

    @Override
    public Object anterior(Object o) {
        if(indice > 0){
            Object[] aux = lista.toArray();
            
            indice--;
            return aux[indice];
        } else {
            return null;
        }
    }

}
