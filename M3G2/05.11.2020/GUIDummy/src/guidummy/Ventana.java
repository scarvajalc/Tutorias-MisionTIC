/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidummy;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class Ventana extends JFrame{
    
    public Ventana() {
        setTitle("Ventana Dummy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponets();
        pack();
        setVisible(true);  
    }
    
    public void initComponets() {
        JPanel panelPrinacipal = new JPanel();
        
        JTextField campoTexto = new JTextField();
        campoTexto.setColumns(10);
        
        JLabel resultadoLabel = new JLabel("Aquí va el resultado");
        
        
        JButton boton = new JButton("Mostrar en Consola");
        ActionListenerPersonalizado actionListener =  new ActionListenerPersonalizado(campoTexto, resultadoLabel);
        boton.addActionListener(actionListener);
        
        panelPrinacipal.add(campoTexto);
        panelPrinacipal.add(boton);
        panelPrinacipal.add(resultadoLabel);
        
        
        setContentPane(panelPrinacipal);
    }
}
