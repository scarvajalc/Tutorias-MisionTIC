/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author PC
 */
public class Clase26Oct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("XVD656", "rojo", 10, 10);
        Carro carro3 = new Carro("ABC223", "verde");
        carro2.ubicar();
        carro2.mover(35, 2);
        carro2.ubicar();
    
     
       
    }
}
