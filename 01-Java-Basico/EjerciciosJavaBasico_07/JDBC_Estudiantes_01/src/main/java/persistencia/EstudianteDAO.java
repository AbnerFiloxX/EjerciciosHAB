/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;



import logica.Estudiante;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    private final String URL = "jdbc:mysql://localhost:3306/universidad";
    private final String USER = "root";
    private final String PASSWORD = "";

    public void agregarEstudiante(Estudiante estudiante) {
        String sql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, estudiante.getNombre());
            stmt.setInt(2, estudiante.getEdad());
            stmt.setFloat(3, estudiante.getCalificacion());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Estudiante> obtenerEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "SELECT * FROM estudiantes";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("edad"),
                        rs.getFloat("calificacion")
                );
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }
}
