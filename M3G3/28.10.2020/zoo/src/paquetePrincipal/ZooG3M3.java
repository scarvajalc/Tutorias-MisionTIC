/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetePrincipal;
import animales.*;
/**
 *
 * @author PC
 */
public class ZooG3M3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro1 = new Perro("Tony",  10, true);
        perro1.verDatos();
        perro1.hacerRuido();
        perro1.comer(80);
        perro1.verDatos();
        perro1.amaestrar();
        perro1.verDatos();
        Elefante elefante1 = new Elefante("DUmbo",40, false);
        elefante1.verDatos();
        Tigre tigre1 = new Tigre("tiger", 20, true);
        tigre1.hacerRuido();
        

        Animal[] zoo = new Animal[3];
        zoo[0] = perro1;
        zoo[1] = elefante1;
        zoo[2] = tigre1;
        
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].hacerRuido();
        }
        
    }
    
}
