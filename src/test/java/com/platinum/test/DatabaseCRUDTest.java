package com.platinum.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.platinum.entities.CtaCorriente;
import com.platinum.utils.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseCRUDTest {

    @Test
    public void testInsertAndReadCtaCorriente() {
        // Crear una nueva cuenta corriente
        CtaCorriente cuenta = new CtaCorriente(0, "23456789-0", 500, "98765432-1");

        // Insertar la cuenta en la base de datos
        boolean insertSuccess = Database.insertarCtaCorriente(cuenta);
        assertTrue(insertSuccess, "La inserción en la base de datos falló.");

        // Leer la cuenta desde la base de datos
        String query = "SELECT * FROM CtaCorriente WHERE rutCliente = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setString(1, cuenta.getRutCliente());
            ResultSet resultSet = stmt.executeQuery();

            // Verificar que la cuenta fue insertada correctamente
            if (resultSet.next()) {
                assertEquals(cuenta.getRutCliente(), resultSet.getString("rutCliente"));
                assertEquals(cuenta.getMonto(), resultSet.getDouble("monto"));
                assertEquals(cuenta.getEjecutivoRut(), resultSet.getString("ejecutivoRut"));
            } else {
                fail("No se encontró la cuenta en la base de datos.");
            }

        } catch (SQLException e) {
            fail("Error al leer desde la base de datos: " + e.getMessage());
        }
    }
}
