package com.platinum.utils;

import com.platinum.entities.CtaCorriente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {

    private static final String URL = "jdbc:mysql://localhost:3306/Cuentas_clientes"; // Ajusta esta URL según tu configuración
    private static final String USER = "root";  // Ajusta el usuario
    private static final String PASSWORD = "12345678";  // Ajusta la contraseña

    // Método para obtener la conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Método para insertar una cuenta corriente
    public static boolean insertarCtaCorriente(CtaCorriente cuenta) {
        String query = "INSERT INTO CtaCorriente (rutCliente, monto, ejecutivoRut) VALUES (?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setString(1, cuenta.getRutCliente());
            stmt.setDouble(2, cuenta.getMonto());
            stmt.setString(3, cuenta.getEjecutivoRut());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
