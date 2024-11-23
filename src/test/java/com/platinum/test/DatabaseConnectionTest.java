package com.platinum.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.platinum.utils.Database;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnectionTest {

    @Test
    public void testDatabaseConnection() {
        // Intentar obtener una conexión usando la clase DatabaseHelper
        try (Connection connection = Database.getConnection()) {
            // Verificar que la conexión no sea nula
            assertNotNull(connection, "La conexión a la base de datos no fue exitosa.");
        } catch (SQLException e) {
            fail("Error en la conexión a la base de datos: " + e.getMessage());
        }
    }
}
