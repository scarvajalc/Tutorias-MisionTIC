/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconceptoconeccionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class PruebaConceptoConeccionBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/universidad?serverTimezone=UTC";
        String usuario = "root";
        String pass = "Admin123";
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(url, usuario, pass);
            System.out.println("Conexion exitosa");

        } catch (SQLException ex) {
            System.out.println("No se pudo establecer la conexión, revise los datos y que el sevidor este activo");
        }   
        
        if (conexion != null) {
            try { 
            
                PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM grado");
                ResultSet resultados = sentencia.executeQuery();

                while (resultados.next()) {
                    System.out.print(resultados.getString("id") + " ");
                    System.out.println(resultados.getString("nombre"));
                }
                PreparedStatement sentencia2 = conexion.prepareStatement("INSERT INTO grado VALUES (14, \"Grado en SQL\")");
                int numeroFilaModificadas = sentencia2.executeUpdate();
                System.out.println("Se modificaron " + numeroFilaModificadas + " filas");
                conexion.close();
            } catch (SQLException e){ 
                System.out.println(e.getMessage());
                System.out.println("Error");
            }
        }
        

    }

}
