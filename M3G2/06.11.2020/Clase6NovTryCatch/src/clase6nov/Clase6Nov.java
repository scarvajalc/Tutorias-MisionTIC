/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6nov;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC
 */
public class Clase6Nov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File file = new File("doc.txt"); 
        
        try {
            Scanner scanner = new Scanner(file);
            String datos = scanner.nextLine();
            System.out.println(datos);
        } catch (FileNotFoundException ex) {
            System.out.println("Disculpe, libro no encontrado");
        }
        
        System.out.println("Soy la siguiente Linea");
        
                
    }
    
}
