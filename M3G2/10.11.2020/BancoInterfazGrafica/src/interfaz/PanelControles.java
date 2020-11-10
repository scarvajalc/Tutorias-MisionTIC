/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import logica.Banco;
import logica.Cuenta;

/**
 *
 * @author PC
 */
public class PanelControles extends JPanel {
    
    Banco banco;
    JTextArea areaInfo;
    
    public PanelControles(Banco banco, JTextArea areaInfo) {
        this.banco = banco;
        this.areaInfo = areaInfo;
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
        ListenerCrearCuenta listenerCrearCuenta = new ListenerCrearCuenta(campoTextoNumeroCuenta, campoTextoNombre, areaInfo, banco);
        botonAgregar.addActionListener(listenerCrearCuenta);

        JButton botonVerCuenta = new JButton("Ver cuenta");
        botonVerCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int numeroCuenta = Integer.parseInt(campoTextoNumeroCuenta.getText());
                Cuenta cuentaEncontrada = banco.buscarCuenta(numeroCuenta);
                if (cuentaEncontrada != null) {
                    areaInfo.setText(cuentaEncontrada.detallesCuenta());
                } else {
                    areaInfo.setText("Cuenta no encontrada");
                }
            }
        });

        JButton botonTodasLasCuentas = new JButton("Todas las cuentas");
        botonTodasLasCuentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                areaInfo.setText(banco.todasLasCuentas());
            }
        });
        
        
        add(labelNumeroCuenta);
        add(campoTextoNumeroCuenta);
        add(labelNombre);
        add(campoTextoNombre);
        add(botonAgregar);
        add(botonVerCuenta);
        add(botonTodasLasCuentas);
    }
    
}
