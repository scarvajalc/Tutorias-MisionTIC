/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostringnull;

/**
 *
 * @author PC
 */
public class Carro {
    private String placa;
    private int nPasajeros;
    private String color;
    
    public Carro(String placa, int nPasajeros, String color) {
        this.nPasajeros = nPasajeros;
        this.color = color;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Este es el carro con placa=" + placa + "\n, con  numero de Pasajeros=" + nPasajeros + ", color=" + color + '}';
    }
    public void dsf(){
        String x = toString();
    }
    
    
}
