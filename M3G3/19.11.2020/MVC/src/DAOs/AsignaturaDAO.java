/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import modelos.Asignatura;

/**
 *
 * @author PC
 */
public class AsignaturaDAO {
    
    Connection conexion;
    String url = "jdbc:mysql://localhost:3306/universidad?serverTimezone=UTC";
    String usuario = "root";
    String pass = "Admin123";
    
   
    
    public ArrayList<Asignatura> obtenerTodas() {
        ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();
        try {
            conexion = DriverManager.getConnection(url, usuario, pass);
            PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM asignatura");
            ResultSet resultados = sentencia.executeQuery();
            while (resultados.next()) {
                int id = resultados.getInt("id");
                String nombre = resultados.getString("nombre");
                int creditos = resultados.getInt("creditos");
                String tipo = resultados.getString("tipo");
                int curso = resultados.getInt("curso");
                int cuatrimestre = resultados.getInt("cuatrimestre");
                Asignatura asignatura = new Asignatura(id, nombre, creditos, tipo, curso, cuatrimestre);
                listaAsignaturas.add(asignatura);
            }
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error de SQL");
            System.out.println(ex.getMessage());
        }
        return listaAsignaturas;
    }
}
