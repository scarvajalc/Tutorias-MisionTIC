/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author PC
 */
public class Persona {
    
    private static String planetaOringen = "Tierra";
    static int anioActual = 2020;
    
    String nombre;
    int edad;
    

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int anioDeNacimiento() {
        int anioActual = Persona.anioActual;
        return anioActual - edad;
    }
    
    
    public static String obtenerPlanetaOrigen() {
        return planetaOringen;
    }
    
    public static void setAnioActual(int nuevoAnio){
        anioActual = nuevoAnio;
    }
    
    
}
