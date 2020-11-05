/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author PC
 */
public class Ventana extends JFrame{

    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
        
        PanelControles panelControles = new PanelControles();
        
        JPanel panelInfo = new JPanel();
        JTextArea areaInfo = new JTextArea(20,25);
        panelInfo.add(areaInfo);
        
        add(panelControles);
        add(panelInfo);
        
        pack();
        setVisible(true);
    }
    
    
    
}
