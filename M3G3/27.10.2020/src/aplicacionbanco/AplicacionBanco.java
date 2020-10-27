/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionbanco;

/**
 *
 * @author PC
 */
public class AplicacionBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta1 = new Cuenta(2345678);
        Cuenta cuenta2 = new Cuenta(234234, "Pepe Peleaz");
        System.out.println(cuenta2.detallesCuenta());
        cuenta2.consignar(1000);
        System.out.println(cuenta2.detallesCuenta());
        boolean transaccionExitosa = cuenta2.retirar(200);
        System.out.println("TransaccionExtiosa?" + transaccionExitosa);
        System.out.println(cuenta2.detallesCuenta());   
        
        Banco miBanco = new Banco("BancoMisionTIC");
        miBanco.agregarCuenta(cuenta1);
        miBanco.agregarCuenta(cuenta2);
        
        //Volver a crear la clase Cuenta y Banco por su cuenta OPCIONAL
        //Crear un banco - Menu 1. Agregar una cuenta 2. Mostar el detalle de una cuenta buscandola por numero de cuenta 3. Mostrar un resumen de todas las cuentas en el banco
        
    }
    
}
