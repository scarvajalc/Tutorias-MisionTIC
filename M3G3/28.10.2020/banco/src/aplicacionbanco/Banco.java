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

public class Banco {
    private String nombre;
    private Cuenta[] arregloCuentas;
    private int nCuentas;
    
    public Banco(String nombre){
        this.nombre = nombre;
        this.arregloCuentas = new Cuenta[1000];
        this.arregloCuentas[0] = new Cuenta(1234567, "Administador del Banco");
        this.nCuentas = 1;
    }
    
    public void agregarCuenta(Cuenta cuentaNueva){
        this.arregloCuentas[this.nCuentas] = cuentaNueva;
        this.nCuentas++;
    }
    
    public Cuenta buscarCuenta(int numeroCuenta){
        for (int i = 0; i < this.nCuentas; i++) {
            if (this.arregloCuentas[i].getNumeroCuenta() == numeroCuenta) {
                return this.arregloCuentas[i];
            }
        }
        return null;
    }
    
    public String todasLasCuentas(){
        String texto = "";
        for (int i = 0; i < this.nCuentas; i++) {
            texto += this.arregloCuentas[i].detallesCuenta() + "\n";
        }
        return texto;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Cuenta[] getArregloCuentas(){
        return this.arregloCuentas;
    }
}
