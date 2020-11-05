/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listenerpersonalizado;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class Ventana extends JFrame{
    
    public Ventana(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Titulo");
        getContentPane().setLayout(new GridLayout(2, 1));
        
        JButton boton1 = new JButton("Click para hola mundo");        
        JButton boton2 = new JButton("Click para chao mundo");
        ListenerPersonalizado alp = new ListenerPersonalizado(1);
        boton1.addActionListener(alp);
        boton1.addMouseMotionListener(alp);
        
        ListenerPersonalizado alp2 = new ListenerPersonalizado(2);
        boton2.addActionListener(alp2);
        
        
        getContentPane().add(boton1);
        getContentPane().add(boton2);
        
        setSize(300, 300);
        setVisible(true);
    }
}
