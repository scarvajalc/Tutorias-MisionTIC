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
public class CuentaCorriente extends Cuenta{
    private int nCheques;
    private int nChequera;
    private int cupoMaximo;
    
    public CuentaCorriente(int numeroCuenta, String nombrePropietario, int nCheques, int nChequera) {
        super(numeroCuenta, nombrePropietario);
        this.nCheques = this.nCheques;
        this.nChequera = nChequera;
        this.cupoMaximo = 1000;
    }
    
    
    @Override
    public boolean tieneSaldoDisponible(int valor) {
        return saldo - valor >= -cupoMaximo;
    }
    
    @Override
    public String toString() {
        String textoDetalles = super.toString();
        textoDetalles += " con numero de chquera " + nChequera + " con cupo maximo de " + cupoMaximo;
        if (saldo < 0) {
            textoDetalles += "\n OJO la cuenta tiene saldo negativo";
        }
        return textoDetalles;
    }
 
 
    
}
