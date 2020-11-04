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
public class Muro extends Elemento{
    private int puntosDeResistencia; 

    public Muro(int x, int y, int puntosDeVida, boolean vivo, int puntosDeResistencia) {
        super(x, y, puntosDeVida, vivo);
        this.puntosDeResistencia = puntosDeResistencia;
        this.caracter = 'M';
    }
    
    
    @Override
    public String toString(){
        String texto = "Se agregó un muro en la posición " + x + "," + y + " que está ";
        if (vivo) {
            texto += "vivo ";
        }else {
            texto += "muerto ";
        }
        texto += "con las siguientes características: \n";
        texto += "Puntos de vida: " + puntosDeVida + "\n";
        texto += "Puntos de resistencia: " + puntosDeResistencia;
        return texto;
    }
}
