
package com.iescomercio.tema8.hospital2;

public class Paciente extends Persona{
    
    private int numHabitacion;
    private Medico doctor;

    public Paciente(String nombre, String dni, int numHabitacion, Medico doctor) {
        super(nombre, dni);
        this.numHabitacion = numHabitacion;
        this.doctor = doctor;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public Medico getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + ". Dni: " + dni + ", Habitacion: " + 
                numHabitacion + ". Doctor: " + doctor.getNombre();
    }
    
    
    
}
