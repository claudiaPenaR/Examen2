package com.platinum.dao;

import com.platinum.entities.CtaCorriente;
import com.platinum.utils.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CtaCorrienteDAO {

    public void insertarCtaCorriente(CtaCorriente cta) {
        String sql = "INSERT INTO CtaCorriente (rutCliente, monto, ejecutivoRUT) VALUES (?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cta.getRutCliente());
            ps.setDouble(2, cta.getMonto());
            ps.setString(3, cta.getEjecutivo());

            ps.executeUpdate();
            System.out.println("CtaCorriente insertada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar CtaCorriente: " + e.getMessage());
        }
    }

    public List<CtaCorriente> listarCtaCorrientes() {
        List<CtaCorriente> lista = new ArrayList<>();
        String sql = "SELECT * FROM CtaCorriente";

        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                CtaCorriente cta = new CtaCorriente(
                        rs.getInt("idCuenta"),
                        rs.getString("rutCliente"),
                        rs.getDouble("monto"),
                        rs.getString("ejecutivoRUT")
                );
                lista.add(cta);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar CtaCorrientes: " + e.getMessage());
        }
        return lista;
    }
}
