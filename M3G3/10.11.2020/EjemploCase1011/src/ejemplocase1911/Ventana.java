/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocase1911;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class Ventana extends JFrame {

    public Ventana() {
        initComponents();
    }
    
    public void initComponents() {
        JPanel panel = new JPanel();
        JButton boton = new JButton("Botón");
        ListenerPersonalizado listener = new ListenerPersonalizado();
        boton.addActionListener(listener);
        
        //setLayout(new GridLayout(10, 1));
        panel.add(boton);
        
        setContentPane(panel);
        //JLabel label = new JLabel("Texto");
        //JTextField jf = new JTextField(10);
        //jf.setColumns(10);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 500);
        setVisible(true); 
    }
    
    
    
}
