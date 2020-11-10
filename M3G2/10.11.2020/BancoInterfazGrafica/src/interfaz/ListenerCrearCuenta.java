/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import logica.Banco;
import logica.Cuenta;

/**
 *
 * @author PC
 */
public class ListenerCrearCuenta implements ActionListener {
    
    JTextField campoTextoNumeroCuenta;
    JTextField campoTextoNombre;
    JTextArea areaInfo;
    Banco banco;
    

    public ListenerCrearCuenta(JTextField campoTextoNumeroCuenta, JTextField campoTextoNombre, JTextArea areaInfo, Banco banco) {
        this.banco = banco;
        this.campoTextoNumeroCuenta = campoTextoNumeroCuenta;
        this.campoTextoNombre = campoTextoNombre;
        this.areaInfo = areaInfo;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) { 
        String nombre = campoTextoNombre.getText();
        int numeroCuenta = Integer.parseInt(campoTextoNumeroCuenta.getText());
        Cuenta cuentaNueva = new Cuenta(nombre, numeroCuenta);
        banco.agregarCuenta(cuentaNueva);
        areaInfo.setText("Cuenta agregada exitosamente.");
    }
    
}
