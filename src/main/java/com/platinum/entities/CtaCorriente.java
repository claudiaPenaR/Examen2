package com.platinum.entities;

public class CtaCorriente {
    private int idCuenta;
    private String rutCliente;
    private double monto;
    private String ejecutivoRut;

    // Constructor
    public CtaCorriente(int idCuenta, String rutCliente, double monto, String ejecutivoRut) {
        this.idCuenta = idCuenta;
        this.rutCliente = rutCliente;
        this.monto = monto;
        this.ejecutivoRut = ejecutivoRut;
    }

    // Getters y setters
    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEjecutivoRut() {
        return ejecutivoRut;
    }

    public void setEjecutivoRut(String ejecutivoRut) {
        this.ejecutivoRut = ejecutivoRut;
    }

    // Método adicional para obtener el nombre del ejecutivo
    // Asumiendo que quieres obtener el nombre completo del ejecutivo
    public String getEjecutivo() {
        // Aquí se podría hacer una consulta para obtener el nombre del ejecutivo si fuera necesario
        // pero por ahora devolveremos el RUT del ejecutivo
        return ejecutivoRut;
    }
}