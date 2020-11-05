/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectourbanizacionbogota;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ConjuntoResidencial {
    String nombreAdministrador;
    boolean salonSocial;
    Casa casaDelAdminstrador;
    ArrayList<Casa> casas;

    public ConjuntoResidencial(String nombreAdministrador, boolean salonSocial, Casa casaDelAdminstrador) {
        this.nombreAdministrador = nombreAdministrador;
        this.salonSocial = salonSocial;
        this.casaDelAdminstrador = casaDelAdminstrador;
        this.casas = new ArrayList();
    }
    
    public void agregarCasa(Casa casaNueva) {
        casas.add(casaNueva);
    }
    
    @Override
    public String toString(){
        return "Admi : " + nombreAdministrador + "vive en casa " + casaDelAdminstrador + "\n" + "Casas: " + casas;
    }
   
   
    
}
