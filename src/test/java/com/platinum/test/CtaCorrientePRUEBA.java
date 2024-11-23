package com.platinum.test;

import com.platinum.dao.CtaCorrienteDAO;
import com.platinum.entities.CtaCorriente;

public class CtaCorrientePRUEBA {

    public static void main(String[] args) {
        CtaCorrienteDAO dao = new CtaCorrienteDAO();

        // Insertar una nueva cuenta corriente
        CtaCorriente nuevaCta = new CtaCorriente(0, "12345678-9", 5000.0, "Juan Pérez");
        dao.insertarCtaCorriente(nuevaCta);

        // Listar todas las cuentas corrientes
        System.out.println("Lista de cuentas corrientes:");
        for (CtaCorriente cta : dao.listarCtaCorrientes()) {
 //           System.out.println(cta.getIdCuenta() + " - " + cta.getRutCliente() + " - " + cta.getMonto() + " - " + cta.getEjecutivo());
        }
    }
}
