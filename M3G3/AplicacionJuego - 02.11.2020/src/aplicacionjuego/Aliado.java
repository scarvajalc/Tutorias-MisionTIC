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
public class Aliado extends Elemento{
    private int puntosDeAtaque;
    private int puntosDeMana;

    public Aliado(int x, int y, int puntosDeVida, boolean vivo, int puntoDeAtaque, int puntosDeMana) {
        super(x, y, puntosDeVida, vivo);
        this.puntosDeMana = puntosDeMana;
        this.puntosDeAtaque = puntoDeAtaque;
        this.caracter = 'A';
    }
    
   @Override
    public String toString(){
        String texto = "Se agregó un aliado en la posición " + x + "," + y + " que está ";
        if (vivo) {
            texto += "vivo ";
        }else {
            texto += "muerto ";
        }
        texto += "con las siguientes características: \n";
        texto += "Puntos de vida: " + puntosDeVida + "\n";
        texto += "Puntos de mana: " + puntosDeMana + "\n";
        texto += "Puntos de ataque: " + puntosDeAtaque ;
        return texto;
    } 
    
}
