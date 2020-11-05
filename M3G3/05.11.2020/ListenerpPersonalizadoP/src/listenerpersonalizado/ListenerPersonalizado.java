/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listenerpersonalizado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author PC
 */
public class ListenerPersonalizado implements ActionListener, MouseMotionListener {
    
    int nBoton;

    public ListenerPersonalizado(int nBoton) {
        this.nBoton = nBoton;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String accion = ae.getActionCommand();
        if (nBoton == 1) {
            System.out.println("Hola Mundo");
        } else {
            System.out.println("Chao Mundo");
        }
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        System.out.println("Me estan arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        System.out.println("Me estoy moviendo y estoy en " + x + " , " + y);
    }
    
}
