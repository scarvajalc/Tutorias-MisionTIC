/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAOs.AsignaturaDAO;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JTextArea;
import modelos.Asignatura;

/**
 *
 * @author PC
 */
public class Controlador {
    
    AsignaturaDAO asiganturaDAO;

    public Controlador() {
        asiganturaDAO = new AsignaturaDAO();
    }
    
    
    
    public void mostrarTablaAsignatura(JTextArea areaTexto) {
        ArrayList<Asignatura> arr = asiganturaDAO.obtenerTodas();
        
        String textoAMostrar = "1\t2\t3\t4\t5\t6\n"; 
        for (Asignatura asignatura : arr) {
            textoAMostrar += asignatura.toString() + "\n";
        }
        areaTexto.setText(textoAMostrar);
    }
}
