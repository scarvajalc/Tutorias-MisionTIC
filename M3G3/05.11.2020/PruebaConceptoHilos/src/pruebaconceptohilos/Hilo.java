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
public class Hilo extends Thread {
    String nombre;

    public Hilo(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("HILO " + nombre + " -Linea" + i);
        }
    }
    
}
