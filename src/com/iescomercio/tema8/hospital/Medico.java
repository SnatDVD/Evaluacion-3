
package com.iescomercio.tema8.hospital;

public class Medico extends Persona{
    
    private Especialidad especialidad;

    public Medico(String nombre, String dni, Especialidad especialidad) {
        super(nombre, dni);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
    
    @Override
    public String toString() {
        return "Paciente: " + nombre + ". Dni: " + dni + ". Especialidad: " +
                especialidad;
    }
}
