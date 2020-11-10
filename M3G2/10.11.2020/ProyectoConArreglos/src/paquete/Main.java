/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.Scanner;
import arrayutils.ArrayPrinter;
/**
 *
 * @author PC
 */
public class Main {
    
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        System.out.println("Ingrese Arreglo 1 separado por espacios");
        String arrInfo = scanner.nextLine();
        String[] arrString = arrInfo.split(" ");
        for (int i = 0; i < 5; i++) {
            arr1[i] = Integer.parseInt(arrString[i]);
        }
        
        System.out.println("Ingrese Arreglo 2 separado por espacios");
        arrInfo = scanner.nextLine();
        arrString = arrInfo.split(" ");
        for (int i = 0; i < 5; i++) {
            arr2[i] = Integer.parseInt(arrString[i]);
        }
        System.out.println("Así quedo el arreglo 1");
        ArrayPrinter.mostrarArreglo(arr1);
        System.out.println("Así quedo el arreglo 2");
        ArrayPrinter.mostrarArreglo(arr2);
        
    }
    
}
