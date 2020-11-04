/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionjuego;

/**
 *
 * @author PC
 */
public abstract class Elemento {
    protected int x;
    protected int y;
    protected int puntosDeVida;
    protected boolean vivo;
    protected char caracter;

    public Elemento(int x, int y, int puntosDeVida, boolean vivo) {
        this.x = x;
        this.y = y;
        this.puntosDeVida = puntosDeVida;
        this.vivo = vivo;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public char getCaracter(){
        return caracter;
    }
    
    public abstract String toString();
}
