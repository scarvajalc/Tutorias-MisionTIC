/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
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
        initComponents();
        pack();
        setVisible(true);
    }
    
    private void initComponents() {
        setLayout(new GridLayout(1, 2));
        
        JPanel panelInfo = new JPanel();
        JTextArea areaInfo = new JTextArea(DatosConfiguracion.anchoAreaTexto, DatosConfiguracion.altoAreaTexto);
        areaInfo.setEnabled(false);
        areaInfo.setBackground(Color.BLACK);
        panelInfo.add(areaInfo);
        
        PanelControles panelControles = new PanelControles(areaInfo);
        
        add(panelControles);
        add(panelInfo);
    }

    
}
