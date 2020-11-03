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
public class MainPruebas {
    public static void main(String[] args) {
        
        CuentaCorriente cc = new CuentaCorriente(1234, "Juan", 10, 4567);
        //System.out.println(c);
        boolean transaccionExitosa = cc.retirar(0);
        System.out.println(transaccionExitosa);
        System.out.println(cc.getSaldo());
        System.out.println(cc);
        
    }
}
