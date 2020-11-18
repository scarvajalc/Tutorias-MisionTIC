/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconeccionmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ProyectoConeccionMysql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/aerolineag3m2?serverTimezone=UTC";;
        String user = DatosConexion.user;
        String pass = DatosConexion.pass;
        try {
            // TODO code application logic here
            Connection conexion = DriverManager.getConnection(url, user, pass);
            System.out.println("Coneccion Exitosa");
            String consultaTablaAviones = "SELECT * FROM avion";
            Statement consultador = conexion.createStatement();
            ResultSet resultado = consultador.executeQuery(consultaTablaAviones);

            while(resultado.next()) {
                System.out.print(resultado.getInt("numero_registro_unico") + " ");
                System.out.print(resultado.getString(2) + " ");
                System.out.println(resultado.getInt(3));
            }
            
            String consultaIsertarAvion = "INSERT INTO avion VALUES (4444, \"BOEING100\", 110)";
            int filasAfectadas = consultador.executeUpdate(consultaIsertarAvion);
            System.out.println("Las filas afectad con la inserción fueron " + filasAfectadas);
            
            
        } catch (SQLException ex) {
            System.out.println("Error al conectarse por lo siguiente: ");
            System.out.println(ex.getMessage());
            //ex.printStackTrace();
        }
        
        
    }
    
}
