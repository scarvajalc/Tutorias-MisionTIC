/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerainterfaz;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class Ventana extends JFrame{
    
    private JPanel panel1;
    
    public Ventana(){
        super("Mi Ventana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();
        pack();
        setVisible(true);
    }
    
    private void inicializarComponentes() {        
        panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.add(new JLabel("Soy el panel 1"));
        modificarPanel1();
        setContentPane(panel1);
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        panel2.add(new JLabel("Soy el panel 2"));
        panel2.add(new Button("Boton1"));
        add(panel2);
        
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.YELLOW);
        panel3.add(new JLabel("Soy el panel 3"));
        add(panel3);
        
    }
    
    public void modificarPanel1(){
        panel1.add(new JTextField());
    }
    
}
