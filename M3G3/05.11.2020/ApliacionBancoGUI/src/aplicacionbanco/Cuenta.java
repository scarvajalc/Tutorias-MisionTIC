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
public abstract class Cuenta {
    //Atributos
    protected int numeroCuenta;
    protected String nombrePropietario;
    protected int saldo; 
    
  
    //COnstructores
    public Cuenta(int numeroCuenta, String nombrePropietario) {
        this.numeroCuenta = numeroCuenta;
        this.nombrePropietario = nombrePropietario;
        this.saldo = 0;
    }
    
    public Cuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombrePropietario = "Cuenta sin nombre";
        this.saldo = 0;
    }
    
    //Metodos
    public void consignar(int valorAConsignar) {
        this.saldo += valorAConsignar;
        
    }
    

    public boolean retirar(int valorARetirar) {
        if (tieneSaldoDisponible(valorARetirar)) {
            this.saldo -= valorARetirar;
            return true;
        } else {
            return false;
        } 
    }
    
    public boolean tieneSaldoDisponible(int valor) {
        return this.saldo >= valor;
    }
    
    
    
    public String detallesCuenta(){
        String textoDetalles = "Cuenta #" + this.numeroCuenta + " a nombre de " + this.nombrePropietario + "\nCon saldo: " + this.saldo;
        return textoDetalles;
    }
    
    @Override
    public String toString(){

        String textoDetalles = "Cuénta #" + this.numeroCuenta + " a nombre de " + this.nombrePropietario + "\nCon saldo: " + this.saldo;
        return textoDetalles;
    }
    
    
    public int getSaldo(){
        return saldo;
    }
    
    public void setNumeroCuenta(int numeroCuenta) {
        //Logica
        if (numeroCuenta > 0){
            this.numeroCuenta = numeroCuenta;
        }   
    }
    
    
    public int getNumeroCuenta(){         
        return this.numeroCuenta;
    }
    
    
}
