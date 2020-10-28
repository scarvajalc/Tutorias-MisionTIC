/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoclaseprincipal;

/**
 *
 * @author PC
 */


public class Cuenta {
    //Atributos
    private String nombre;
    private int numeroCuenta;
    private double saldo;
    
    //Constructor
    public Cuenta(String nombre, int numeroCuenta) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }
    
    
    //Metodos
    public boolean retirarSaldo(double valor) {
        if (saldoDisponible(valor)) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
    public void agregarSaldo(double valor){
        this.saldo += valor;
    }
    
    public boolean saldoDisponible(double valor){
        if (valor > this.saldo){
            return false;
        }
        return true;
    }
    
    public String detallesCuenta(){
        String textoDetalles = "Cuenta #" + this.numeroCuenta + " a nombre de :" + this.nombre + "\nSaldo =" + this.saldo;
        return textoDetalles;
    }
    
    public boolean transferir(Cuenta cuentaDestino, int valor) {
        if (this.saldoDisponible(valor)){
            this.saldo -= valor;
            cuentaDestino.agregarSaldo(valor);
            return true;
        }
        return false;   
    }
    
    //Setters y getters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
}
