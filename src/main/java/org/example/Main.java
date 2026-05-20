package org.example;

import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                DBConfig.getUrl(),
                DBConfig.getUser(),
                DBConfig.getPassword());
             Statement st = conn.createStatement();) {
            System.out.println("Conexión establecida con Oracle.");

            String consulta = "SELECT NOMBRE, SALARIO FROM EMPLEADO";
            ResultSet rs = st.executeQuery(consulta);
            System.out.printf("%-10s %-10s\n", "NOMBRE", "SALARIO");
            System.out.println("-".repeat(20));
            while (rs.next()) {
                System.out.printf("%-10s %-10s\n", rs.getString(1), rs.getInt(2));
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }
}