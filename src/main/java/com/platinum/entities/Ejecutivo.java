package com.platinum.entities;


public class Ejecutivo {
    private String rutEjecutivo; // PK
    private String nombre;
    private String departamento;

    // Constructor
    public Ejecutivo(String rutEjecutivo, String nombre, String departamento) {
        this.rutEjecutivo = rutEjecutivo;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    // Getters y Setters
    public String getRutEjecutivo() {
        return rutEjecutivo;
    }

    public void setRutEjecutivo(String rutEjecutivo) {
        this.rutEjecutivo = rutEjecutivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
