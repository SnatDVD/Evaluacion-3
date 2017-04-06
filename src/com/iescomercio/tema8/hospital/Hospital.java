package com.iescomercio.tema8.hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Hospital {

    private static final int NUM_PLANTAS = 4;
    private ArrayList<Persona> personas;

    public Hospital() {
        personas = new ArrayList();
    }

    private int pacientesEnPlanta(int planta) {
        int cont = 0;

        if (planta > 0 && planta <= NUM_PLANTAS) {
            for (Persona p : personas) {
                if (p instanceof Paciente) {
                    int aux = ((Paciente) p).getNumHabitacion();
                     aux = Character.getNumericValue((aux + "").charAt(0));
                    if (aux == planta) {
                        cont++;
                    }
                }
            }
        }
        return cont;
    }

    public void inicializarHospital() {

// ------------ Creo los médicos
        Medico Cifuentes = new Medico("Cifuentes", "87654321", Especialidad.TRAUMA);

        Medico Lozano = new Medico("Lozano", "87654322", Especialidad.PEDIATRIA);

        Medico Dominguez = new Medico("Domínguez", "87654324", Especialidad.CIRUGIA);

        Medico Martinez = new Medico("Martínez", "87654323", Especialidad.TRAUMA);
        
        Medico Casado = new Medico("Casado", "56487224", Especialidad.RADIO);

// ------------ Añado los médicos al hospital
        agregarPersona(Cifuentes);

        agregarPersona(Lozano);

        agregarPersona(Dominguez);

        agregarPersona(Martinez);
        
        agregarPersona(Casado);

// ------------ Añado los pacientes al hospital
        agregarPersona(new Paciente("Juan", "12345678", 123, Cifuentes));

        agregarPersona(new Paciente("Maria", "01234567", 231, Dominguez));

        agregarPersona(new Paciente("Pepe", "11234567", 231, Lozano));

        agregarPersona(new Paciente("Pedro", "21234567", 123, Cifuentes));

        agregarPersona(new Paciente("Luisa", "31234567", 222, Martinez));

        agregarPersona(new Paciente("Angel", "41234567", 231, Cifuentes));

        agregarPersona(new Paciente("Leire", "51234567", 111, Dominguez));

        agregarPersona(new Paciente("Toto", "6234567", 124, Lozano));

        agregarPersona(new Paciente("Tito", "71234567", 303, Lozano));

        agregarPersona(new Paciente("Luis", "81234567", 171, Martinez));
        
        agregarPersona(new Paciente("Juanito", "10101010", 444, Casado));

// ------------ Añado los enfermeros al hospital

        agregarPersona(new Enfermero("Carmen", "11112222", Cifuentes, Especialidad.TRAUMA));
    
        agregarPersona(new Enfermero("Soledad", "22221111", Lozano, Especialidad.CIRUGIA));
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public int numPacientes() {
        int cont = 0;
        for (Persona p : personas) {
            if (p instanceof Paciente) {
                cont++;
            }
        }
        return cont;
    }

    public int numMedicos() {
        int cont = 0;
        for (Persona p : personas) {
            if (p instanceof Medico) {
                cont++;
            }
        }
        return cont;
    }

    public Paciente pacienteAzar(String nombreMedico) {
        Random rand = new Random();
        int aux = rand.nextInt(personas.size());

        if (personas.get(aux) instanceof Paciente) {
            Paciente pac = (Paciente) personas.get(aux);
            if (pac.getDoctor().getNombre() == nombreMedico) {
                return pac;
            }
        }
        return pacienteAzar(nombreMedico);
    }

    public void verPacientesPlanta() {

        for (int c = 1; c <= NUM_PLANTAS; c++) {
            System.out.println("Planta " + c + " -- " + pacientesEnPlanta(c));
        }
    }

    public int numHabitacionesOcupadas() {
        HashSet<Integer> aux = new HashSet();

        for (Persona p : personas) {
            if (p instanceof Paciente) {
                aux.add(((Paciente) p).getNumHabitacion());
            }
        }
        return aux.size();
    }

    public String plantaConMasPacientes() {
        int plantaMax = 0, maxPacientes = 0;

        for (int c = 1; c <= NUM_PLANTAS; c++) {
            if (pacientesEnPlanta(c) >= maxPacientes) {
                plantaMax = c;
                maxPacientes = pacientesEnPlanta(c);
            }
        }
        return "Planta " + plantaMax + ". Con " + maxPacientes + " pacientes.";
    }

    public int costeDiario() {
        int acum = 0;

        for (Persona p : personas) {
            acum = acum + 200;
            if (p instanceof Paciente) {
                acum = acum + 300;
            } else if (p instanceof Medico) {
                acum = acum + 500;
            } else if (p instanceof Enfermero) {
                acum = acum + 400;
            }
        }
        return acum;
    }

    public void listarPersonas() {
        for (Persona p : personas) {
            System.out.println(p.toString());
            System.out.println("    ::::::::::::::::::::::::::  ");
        }
    }

    
    
}
