/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorav0;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author PC
 */
public class Ventana extends JFrame {

    public Ventana() {
        initComponents();
    } 
    
    public void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Número");
        label.setHorizontalAlignment(JLabel.CENTER);
        JTextField campoNumero = new JTextField(10);
        JTextField campoResultado = new JTextField(10);
        campoResultado.setEnabled(false);
        JButton botonSumar = new JButton();
        botonSumar.setText("Sumar 2");
        
        botonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                campoResultado.setText(Integer.toString(Integer.parseInt(campoNumero.getText()) + 2));
            }
        });
        panel.setBorder(new EmptyBorder(5, 10, 5, 10));
        panel.setLayout(new GridLayout(10,1));
        panel.add(label);
        panel.add(campoNumero);
        panel.add(botonSumar);
        panel.add(campoResultado);
        
        setContentPane(panel);
        pack();
        setVisible(true);
    }
}
