/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class PanelControles extends JPanel{
    
    JTextArea areaInfo;

    public PanelControles(JTextArea areaInfo) {
        this.areaInfo = areaInfo;
        initComponets();
    }
    
    private void initComponets() {
        setLayout(new GridLayout(10, 1));
        
        JLabel labelNumeroCuenta = new JLabel("Número de la cuenta");
        JLabel labelNombre = new JLabel("Nombre del propietario");
        
        JTextField campoTextoNumeroCuenta = new JTextField(10);
        JTextField campoTextoNombre = new JTextField(10);
        
        JRadioButton radioButtonAhorros =  new JRadioButton("Ahorros");
        
        JButton botonAgregar = new JButton("Agregar cuenta");
        Listener listener = new Listener(campoTextoNumeroCuenta, campoTextoNombre, radioButtonAhorros, areaInfo);
        botonAgregar.addActionListener(listener);
        
        JButton botonVerCuenta = new JButton("Ver cuenta");
        botonVerCuenta.addActionListener(listener);
        
        JButton botonTodasLasCuentas = new JButton("Todas las cuentas");
        botonTodasLasCuentas.addActionListener(listener);
        
        add(labelNumeroCuenta);
        add(campoTextoNumeroCuenta);
        add(labelNombre);
        add(campoTextoNombre);
        add(radioButtonAhorros);
        add(botonAgregar);
        add(botonVerCuenta);
        add(botonTodasLasCuentas);
    }
    
    
}
