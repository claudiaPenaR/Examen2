package com.platinum.entities;
public class Transaccion {
    private int id; // PK auto incremental
    private String rutCliente; // FK
    private String rutDueño; // FK
    private int idCuenta; // FK
    private double montoTransferencia;
    private String cuentaTransferencia;
    private String tipoCuenta;

    // Constructor
    public Transaccion(int id, String rutCliente, String rutDueño, int idCuenta, double montoTransferencia, String cuentaTransferencia, String tipoCuenta) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.rutDueño = rutDueño;
        this.idCuenta = idCuenta;
        this.montoTransferencia = montoTransferencia;
        this.cuentaTransferencia = cuentaTransferencia;
        this.tipoCuenta = tipoCuenta;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getRutDueño() {
        return rutDueño;
    }

    public void setRutDueño(String rutDueño) {
        this.rutDueño = rutDueño;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public double getMontoTransferencia() {
        return montoTransferencia;
    }

    public void setMontoTransferencia(double montoTransferencia) {
        this.montoTransferencia = montoTransferencia;
    }

    public String getCuentaTransferencia() {
        return cuentaTransferencia;
    }

    public void setCuentaTransferencia(String cuentaTransferencia) {
        this.cuentaTransferencia = cuentaTransferencia;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
