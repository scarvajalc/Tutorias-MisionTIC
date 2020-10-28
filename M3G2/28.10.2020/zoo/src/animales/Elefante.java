/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author PC
 */
public class Elefante extends Animal{
    String nombre;
    int peso;
    boolean agresivo;

    public Elefante(String nombre, int peso, boolean agresivo) {
        super(nombre, peso, agresivo);
    }
    
    
    public void hacerRuido() {
        System.out.println("Truuuuuuuuuuuuuuuuuuuuuuuuu");
    }
    
    
}
