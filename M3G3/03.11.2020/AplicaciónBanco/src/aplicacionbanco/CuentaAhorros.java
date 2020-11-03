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
public class CuentaAhorros extends Cuenta{
    boolean exenta4x1000;

    public CuentaAhorros(int numeroCuenta, String nombrePropietario, boolean exenta4x1000) {
        super(numeroCuenta, nombrePropietario);
        this.exenta4x1000 = exenta4x1000;
    }
    
    @Override
    public String toString() {
        String textoDetalles = super.toString();
        textoDetalles += " exenta de 4a por mil? " + exenta4x1000;
        return textoDetalles;
    }
      
}
