/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidummy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class ActionListenerPersonalizado implements ActionListener{
    
    JTextField campoTexto;
    JLabel resultadoLabel;

    public ActionListenerPersonalizado(JTextField campoTexto, JLabel resultadoLabel) {
        this.campoTexto = campoTexto;
        this.resultadoLabel = resultadoLabel;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(campoTexto.getText());  
        resultadoLabel.setText(campoTexto.getText());
    }
    
}
