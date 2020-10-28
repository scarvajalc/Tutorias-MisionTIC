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
public abstract class Animal {
    String nombre;
    int peso;
    boolean agresivo;

    public Animal(String nombre, int peso, boolean agresivo) {
        this.nombre = nombre;
        this.peso = peso;
        this.agresivo = agresivo;
    }
    
    public void amaestrar(){
        agresivo = false;
    }
    
    public void comer(int cantidad) {
        if (cantidad > peso / 8) {
            peso += 4;
        } else {
            peso++;
        }
    }
    
    public void hacerEjercicio(int tiempo){
        if (tiempo > 4) {
            peso -= 4;
        } else {
            peso -= 1;
        }
    }
    
    public void verDatos() {
        System.out.println("Hola soy " + nombre + " peso " + peso + "kilos, agresivo?" + agresivo);
    }
    
    public abstract void hacerRuido();
    
      
}
