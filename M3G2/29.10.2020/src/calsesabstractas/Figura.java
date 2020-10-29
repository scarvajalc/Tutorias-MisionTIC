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
public abstract class Figura {
    
    int x;
    int y;
    String color;
    int alto;
    int ancho;
    
    public Figura(int x, int y, String color, int alto, int ancho) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public void mostrarDetalles() {
        System.out.println(x + y + color + alto + ancho);
    } 
    
    public abstract void pintar();
    
    
    
}


