/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author PC
 */
import java.util.Scanner;

public class RepasoDeArreglos {

    /**
     * @param args the command line arguments
     */
    static void imprimirArregloEntero(int[] arreglo){
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            if (i == arreglo.length - 1){
                System.out.print(arreglo[i]);
            } else {
                System.out.print(arreglo[i] + ", ");
            }   
        }
        System.out.println("]");
    }
    
    static void imprimirArregloString(String[] arreglo){
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            if (i == arreglo.length - 1){
                System.out.print(arreglo[i]);
            } else {
                System.out.print(arreglo[i] + ", ");
            }   
        }
        System.out.println("]");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese datos");
        

        String datos = scanner.nextLine();
        String[] arrDatos = datos.split(" ");
        int[] arreglo = new int[arrDatos.length];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(arrDatos[i]);
        }
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        
        double promedio = (double)suma / arreglo.length;
        System.out.println("El promedio es " + promedio);
        System.out.println("Los datos ingresados fueron: ");
        imprimirArregloEntero(arreglo);
             

    }
    
}
