/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionbanco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */

public class Banco {
    private String nombre;
    private ArrayList<Cuenta> arregloCuentas;
    
    
    public Banco(String nombre){
        this.nombre = nombre;
        this.arregloCuentas = new ArrayList<Cuenta>();
        this.arregloCuentas.add(new CuentaCorriente(1234567, "Administador del Banco", 100000, 12345));
    }
    
    public void agregarCuenta(Cuenta cuentaNueva){
        this.arregloCuentas.add(cuentaNueva);
    }
    
    public Cuenta buscarCuenta(int numeroCuenta){
        for (int i = 0; i < this.arregloCuentas.size(); i++) {
            if (this.arregloCuentas.get(i).getNumeroCuenta() == numeroCuenta) {
                return this.arregloCuentas.get(i);
            }
        }
        return null;
    }
    
    public String todasLasCuentas() {
        String texto = "";
        for (int i = 0; i < this.arregloCuentas.size(); i++) {
            texto += this.arregloCuentas.get(i).toString() + "\n";
        }
        return texto;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Cuenta> getArregloCuentas(){
        return this.arregloCuentas;
    }
}
