/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import logica.Banco;

/**
 *
 * @author PC
 */
public class PanelControles extends JPanel {
    
    Banco banco;
    
    public PanelControles(Banco banco) {
        this.banco = banco;
        initComponents();
    }
    
    private void initComponents() {
        GridLayout gridLayout = new GridLayout(10,1);
        gridLayout.setVgap(10);
        setLayout(gridLayout);
        
        JLabel labelNumeroCuenta = new JLabel("Número de cuenta");
        JLabel labelNombre = new JLabel("Nombre del propietario");
        
        JTextField campoTextoNumeroCuenta = new JTextField(10);
        JTextField campoTextoNombre = new JTextField(10);
        
        
        JButton botonAgregar = new JButton("Agregar Cuenta");
        ListenerCrearCuenta listenerCrearCuenta = new ListenerCrearCuenta(campoTextoNumeroCuenta, campoTextoNombre, banco);
        botonAgregar.addActionListener(listenerCrearCuenta);
        JButton botonVerCuenta = new JButton("Ver cuenta");
        JButton botonTodasLasCuentas = new JButton("Todas las cuentas");
        
        
        add(labelNumeroCuenta);
        add(campoTextoNumeroCuenta);
        add(labelNombre);
        add(campoTextoNombre);
        add(botonAgregar);
        add(botonVerCuenta);
        add(botonTodasLasCuentas);
    }
    
}
