/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorav0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class ListenerSumar2 implements ActionListener{
    
    JTextField campoResultado;
    JTextField campoNumero;

    public ListenerSumar2(JTextField campoResultado, JTextField campoNumero) {
        this.campoResultado = campoResultado;
        this.campoNumero = campoNumero;
    }

 
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        campoResultado.setText(Integer.toString(Integer.parseInt(campoNumero.getText()) + 2));
    }
    
}
