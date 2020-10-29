/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calsesabstractas;

/**
 *
 * @author PC
 */
public class CalsesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado cuadrado = new Cuadrado(0, 0 , "rojo", 15, 15);
        Circulo circulo = new Circulo(10, 10, "negro", 10, 12);
        
        Figura[] arr = new Figura[2];
        arr[0] = cuadrado;
        arr[1] = circulo;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i].pintar();
        }
        
    }
    
}
