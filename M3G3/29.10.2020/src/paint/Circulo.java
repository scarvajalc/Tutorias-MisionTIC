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
public class Circulo extends Figura implements Escalable{
    
    public Circulo(Posicion posicion, String color, int tamanio) {
        super(posicion, color, tamanio);
    }
    
    public void pintar(){
        System.out.println("Circulo se esta pintado");
        System.out.println("  .nd888bn.\n" +
                        ".d888888888b.\n" +
                        "8888888888888\n" +
                        "8888888888888\n" +
                        "8888888888888\n" +
                        "`+888888888+'\n" +
                        "  `\"+888+\"'");
    }

    @Override
    public void aumentarTamanio() {
        System.out.println("estoy aumentando mi tamaño");
    }

    @Override
    public void disminuirTamanio() {
        System.out.println("estoy diminuyendo mi tamaño");
    }
    
    
    
    
}
