/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazmultiidioma;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import textos.Textos;
import textos.TextosEnglish;
import textos.TextosEspaniol;

/**
 *
 * @author PC
 */
public class Ventana extends JFrame{
    
    String idioma;
    
    public Ventana() {
        idioma = "English";
        initComponents();
    }
    
    public void initComponents(){
        Textos textos; 
        if (idioma.equals("Español")) {
            textos = new TextosEspaniol();
        } else {
            textos= new TextosEnglish();
        }
       
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Idioma");
        JMenuItem itemEspaniol = new JMenuItem("Español");
        JMenuItem itemEnglish = new JMenuItem("English");
        
        itemEspaniol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //CODGIO PARA CAMBIAR LOS TEXTOS A ESPA|NOL
            }
        });
        itemEnglish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //CODGIO PARA CAMBIAR LOS TEXTOS A Ingles
            }
        });
        
        menu.add(itemEspaniol);
        menu.add(itemEnglish);
        barraMenu.add(menu);
        setJMenuBar(barraMenu);
        
        getContentPane().setLayout(new GridLayout(10, 1));
        
        JLabel labelNombre = new JLabel(textos.textoEtiquetaNombre);
        labelNombre.setHorizontalAlignment(JLabel.CENTER);
        JLabel labelApellido = new JLabel(textos.textoEtiquetaApellido);
        labelApellido.setHorizontalAlignment(JLabel.CENTER);
        JLabel labelEdad = new JLabel(textos.textoEtiquetaEdad);
        labelEdad.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField campoNombre = new JTextField(10);
        JTextField campoApellido = new JTextField(10);
        JTextField campoEdad = new JTextField(10);
        
        JButton botonAgregar = new JButton(textos.textoBotonRegistrar);
        
        add(labelNombre);
        add(campoNombre);
        add(labelApellido);
        add(campoApellido);
        add(labelEdad);
        add(campoEdad);
        add(botonAgregar);
        
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
