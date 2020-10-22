/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
package paquete1;

import java.util.Scanner;

public class ClasePrincipal {
  
    
    static int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }
    
    static double calcularAreaCirculo(double radio){
        double area = radio * radio * 3.1416;
        return area;
    }
    
    static void mostrarMenu(String nombre){
        System.out.println("Hola, Bienvenido " +  nombre);
        System.out.println("Ingrese 1 para agregar producto 2. para pagar, 3 para salir");
    }

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre;
        System.out.println("Por favor ingrese su mombre");       
        nombre = lector.nextLine();
        String apellido = lector.next();
        System.out.println("Por favor ingrese su edad");
        System.out.println("Buenas tardes " + nombre + " " + apellido + "su edad es");
        mostrarMenu(nombre); 
        
                    
    }
                                                                                    
}
