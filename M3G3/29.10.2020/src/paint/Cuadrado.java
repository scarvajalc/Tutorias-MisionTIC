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
public class Cuadrado extends Figura{
    
    public Cuadrado(Posicion posicion, String color, int tamanio) {
        super(posicion, color, tamanio);
    }
    
    public void pintar () {
        System.out.println("Pintando cuadrado con color, posición y tmaño especificados");
    }
    
}
