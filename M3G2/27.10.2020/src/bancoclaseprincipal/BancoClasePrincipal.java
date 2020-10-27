/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoclaseprincipal;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class BancoClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Pepito Perez";
        int numero = 123123;
        Cuenta cuenta1 = new Cuenta(nombre, numero);
        cuenta1.agregarSaldo(1200);
        Cuenta cuenta2 = new Cuenta("Juanito Alimaña", 24234);
        boolean operacionExtiosa = cuenta1.transferir(cuenta2, 2000);
        System.out.println("Operacion Exitosa " + operacionExtiosa);
        System.out.println(cuenta1.detallesCuenta());
        System.out.println(cuenta2.detallesCuenta());
        Banco mibanco = new Banco("Banco MisionTIC");
        mibanco.agregarCuenta(cuenta1);
        
        
        //Crear en el main 1 menu que permita agregar cuentas al banco, Ver todos los detalles de todas las cuentas del banco, Ver lo detalles de 1 sola cuenta a partir del numero cuenta
        
        
        
                
        
    }
    
}
