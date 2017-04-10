package com.iescomercio.tema8.hospital2;

public enum Especialidad {

    CIRUGIA("Cirugía menor"),
    PEDIATRIA("Pediatría"),
    TRAUMA("Trauma"),
    RADIO("Radio");

    private String descripcion;

    Especialidad(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
