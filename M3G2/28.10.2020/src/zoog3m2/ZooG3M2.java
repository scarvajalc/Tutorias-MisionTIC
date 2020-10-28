/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoog3m2;

import animales.Animal;
import animales.Perro;
import animales.Tigre;
/**
 *
 * @author PC
 */
public class ZooG3M2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro1  = new Perro("Tony", 10, false);
        //perro1.verDatos();
        //perro1.comer(999);
        //perro1.verDatos();
        //perro1.hacerRuido();
        Tigre tigre1 = new Tigre("Falcao" ,20, true);
        //tigre1.verDatos();
        //tigre1.amaestrar();
        //tigre1.verDatos();
        //tigre1.hacerRuido();
        
        Animal[] zoo = new Animal[2];
        zoo[0] = perro1;
        zoo[1] = tigre1;
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].hacerRuido();
        }
    }
    
}
