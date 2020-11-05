/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconceptohilos;

/**
 *
 * @author PC
 */
public class PruebaConceptoHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hilo miHilo1 = new Hilo("Pasamos Ciclo 2");
        Hilo miHilo2 = new Hilo("Todos Perdemos el ciclo 2");
        Hilo miHilo3 = new Hilo("Suerte por 10 años");
        miHilo1.start();
        miHilo2.start();
        miHilo3.start();
        
    }
    
}
