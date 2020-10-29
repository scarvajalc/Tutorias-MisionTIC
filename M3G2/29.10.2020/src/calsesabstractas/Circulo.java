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
public class Circulo extends Figura implements Escalable{
    
    public Circulo(int x, int y, String color, int alto, int ancho) {
        super(x, y, color, alto, ancho);
    }
    public void pintar(){
        System.out.println("Cuadrado se esta pintado");
    }
    
    public  void aumentarTamano(){
        
    }
    
    public void disminuirTamano(){
        
    }
}
