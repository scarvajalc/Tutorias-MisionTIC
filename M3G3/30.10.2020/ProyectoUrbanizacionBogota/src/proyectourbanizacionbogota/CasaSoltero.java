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
public class CasaSoltero extends Casa {

    public CasaSoltero(int numeroVentanas, String color, int nPisos) {
        super(numeroVentanas, color, nPisos);
    }
    

    @Override
    public void hacerFiesta() {
        System.out.println("Yujuuuu una rumba muy tremenda");
    }
    
}
