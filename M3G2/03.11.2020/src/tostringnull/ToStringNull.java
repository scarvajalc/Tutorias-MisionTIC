/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostringnull;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ToStringNull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        //Carro carro1 = new Carro(null, 5, "verde");
        int x = 0;
        boolean error = true;
        while (error) {
            try {
                x = Integer.parseInt(scanner.nextLine());
                error = false;
            } catch (Exception e) {
                error = true;
                System.out.println("Hubo un error, va a ver la raiz de 0");
            }
        }

        
         
        double resultado = Math.sqrt(x);
        System.out.println("La raiz cuadrada de " + x + " es " + resultado);
          
        
    }
    
    
    
}
