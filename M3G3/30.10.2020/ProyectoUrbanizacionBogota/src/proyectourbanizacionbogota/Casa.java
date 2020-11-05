/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectourbanizacionbogota;

/**
 *
 * @author PC
 */
public class Casa{
    
    private int numeroVentanas;
    private String color;
    private int nPisos;
    
    //Constructor
    public Casa(int numeroVentanas, String color, int nPisos){
        this.numeroVentanas = numeroVentanas;
        this.color = color;
        this.nPisos = nPisos;
    }
    
    public void pintar(String color) {
        this.color = color;
    }
    
    public void construirUnPiso(){
        this.nPisos++;
    }
    
    public void hacerFiesta(){
        System.out.println("Tomarse unas cervezas");
    };
    
    
    
    @Override
    public String toString(){
        if (numeroVentanas > 2) {
            return "Casa Apta" +" con " + numeroVentanas + "ventanas de color " + color;
        } else {
            return "Casa NO Apta" +" con " + numeroVentanas + "ventanas de color " + color;
        }
        
    }
    
    
    
}
