/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

/**
 *
 * @author PC
 */
public abstract class Figura {
    Posicion posicion;
    String color;
    int tamanio;

    public Figura(Posicion posicion, String color, int tamanio) {
        this.posicion = posicion;
        this.color = color;
        this.tamanio = tamanio;
    }
    
    public void verDetalles() {
        System.out.println("pos: " + posicion.x + ", " + posicion.y + " color " + color + " tam " + tamanio );
    }
    
    public abstract void pintar();
        
}


