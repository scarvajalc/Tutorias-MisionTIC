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
public class Tigre extends Animal{
    
    public Tigre(String nombre, int peso, boolean agreasivo) {
        super(nombre, peso, agreasivo);
    }
    
    @Override
    public void hacerRuido() {
        System.out.println("Grrrrrrrrr");
    }
    
    
    
}
