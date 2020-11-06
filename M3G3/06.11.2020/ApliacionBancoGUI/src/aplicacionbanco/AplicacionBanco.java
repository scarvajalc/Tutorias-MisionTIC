/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionbanco;

import java.util.Scanner;

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
   
        Scanner scanner = new Scanner(System.in);
        Banco banco = Banco.obtenerInstancia();
        
        int opcion;
        do{
            System.out.println("1. agregar cuenta 2. buscar cuenta 3. ver todas las cuentas 5. salir");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Nombre?");
                    String nombre = scanner.nextLine();
                    System.out.println("Numero de cuenta?");
                    int numeroCuenta = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ahorros?");
                    boolean ahorros = Boolean.parseBoolean(scanner.nextLine());
                    Cuenta cuentaNueva;
                    if (ahorros) { 
                        cuentaNueva = new CuentaAhorros(numeroCuenta, nombre, false);
                    } else {
                        cuentaNueva = new CuentaCorriente(numeroCuenta, nombre, 10, 234);
                    }
                    
                    banco.agregarCuenta(cuentaNueva);
                    break;
                case 2:
                    System.out.println("Numero de cuenta?");
                    numeroCuenta = Integer.parseInt(scanner.nextLine());
                    Cuenta cuentaEncontrada = banco.buscarCuenta(numeroCuenta);
                    if (cuentaEncontrada != null) {
                        System.out.println(cuentaEncontrada);
                    } else {
                        System.out.println("Cuenta no encontrada");
                    }
                    break;
                case 3:
                    System.out.println(banco.todasLasCuentas());
                    break;

                case 5:
                    System.out.println("Bye");
                    break;
            }
            
        }while(opcion != 5);
        
        
    }
    
}
