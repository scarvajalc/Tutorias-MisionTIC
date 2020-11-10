/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import logica.Banco;

/**
 *
 * @author PC
 */
public class Main {
    
    public static void main(String[] args) {
        Banco banco = new Banco();
        Ventana ventana = new Ventana(banco);

        
    }
    
}
