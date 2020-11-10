/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocase1911;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class ListenerPersonalizado implements ActionListener{

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Hola mundo");
    }
    
}
