/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Arreglos {
    
    static void imprimirArregloEnteros(int[] arreglo){
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++){
            if (i == arreglo.length - 1){
                System.out.print(arreglo[i] );
            } else {
                System.out.print(arreglo[i] + ", ");
            }
        }
        System.out.println("]");
    }
    
    static void imprimirArregloString(String[] arreglo){
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++){
            if (i == arreglo.length - 1){
                System.out.print(arreglo[i] );
            } else {
                System.out.print(arreglo[i] + ", ");
            }
        }
        System.out.println("]");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese sus datos separados por esapacios");
        String datos = scanner.nextLine();
        String[] datosArr = datos.split(" ");
        int[] arreglo = new int[datosArr.length]; 
        
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = Integer.parseInt(datosArr[i]);
        }
        
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++){
            suma = suma + arreglo[i];
        }
        double promedio = suma / (double)arreglo.length;
        System.out.println("El promedio es " + promedio);
        System.out.println("Sus datos ingresado fueron: ");
        imprimirArregloEnteros(arreglo);
        
        
    }
    
}
