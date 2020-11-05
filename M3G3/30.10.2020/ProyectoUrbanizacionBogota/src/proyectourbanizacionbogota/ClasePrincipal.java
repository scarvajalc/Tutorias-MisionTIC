/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectourbanizacionbogota;

/**
 *
 * @author PC
 */
public class ClasePrincipal {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Casa casaAdministrador = new Casa(10, "Mate", 4);
        ConjuntoResidencial conjunto1 = new ConjuntoResidencial("Tito Perez", true, casaAdministrador);
        Casa casaNueva = new CasaSoltero(2, "Rojo", 1);
        conjunto1.agregarCasa(casaNueva);
        Casa casaNueva2 = new CasaFamilia(2, "Rojo", 1);
        conjunto1.agregarCasa(casaNueva2);
        Casa casaNueva3 = new Casa(2, "Rojo", 1);
        conjunto1.agregarCasa(casaNueva3);
        
        System.out.println(conjunto1);
     
    }
}


