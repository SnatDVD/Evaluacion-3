
package com.iescomercio.tema8.hospital2;

public class Enfermero extends Persona implements Sanitario {

    private Medico doctor;
    private Especialidad especialidad;

    public Enfermero(String nombre, String dni, Medico doctor, Especialidad especialidad) {
        super(nombre, dni);
        this.doctor = doctor;
        this.especialidad = especialidad;
    }
    
    @Override
    public String toString() {
        return "Enfermero: " + nombre + ". Dni: " + dni + ". Medico " + 
                doctor.getNombre() + ". Especialidad: " + especialidad;
    }
    
}
