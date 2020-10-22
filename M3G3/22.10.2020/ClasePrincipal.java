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
    
    static double potencia(double base, int exponente) {
        if (exponente < 0) {
            System.out.println("Esta funcion no permite exponentes negativos, el resultado que va aobtener es erroneo");
        }
        double resultado = 1;
        for (int j = 0; j < exponente; j++) {
            resultado = resultado * base;
        }

        return resultado;
             
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double resultado = potencia(2, 3);
        //System.out.println(resultado);
        double base;
        int exponente;
        String nombre;
        System.out.println("Por favor ingrese todos los datos");
        base = scanner.nextDouble();
        exponente = scanner.nextInt();
        scanner.nextLine();
        nombre = scanner.nextLine();
        System.out.println(base + exponente + nombre);
          
                 
    }
                                                                                    
}


/*
Ejercicio
Entradas:
n -> int

mes -> int
anio -> int

Salida
La cantidad de dias de el mes seleccionado en el año seleccionado

*/