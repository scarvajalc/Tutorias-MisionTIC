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
public class Enemigo extends Elemento{
    private boolean venenoso;

    public Enemigo(int x, int y, int puntosDeVida, boolean vivo, boolean venenoso) {
        super(x, y, puntosDeVida, vivo);
        this.venenoso = venenoso;
        this.caracter = 'E';
    }
    
    
    @Override
    public String toString(){
        String texto = "Se agregó un enemigo en la posición " + x + "," + y + " que está ";
        if (vivo) {
            texto += "vivo ";
        }else {
            texto += "muerto ";
        }
        texto += "con las siguientes características: \n";
        texto += "Puntos de vida: " + puntosDeVida + "\n";
        texto += "Es venenoso?: " + venenoso;
        return texto;
    }
    
}
