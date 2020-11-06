/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import logica.Banco;

/**
 *
 * @author PC
 */
public class Ventana extends JFrame{
    
    Banco banco;
    
    public Ventana(Banco banco) {
        this.banco = banco;
        setTitle("Banco");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        pack();
        setVisible(true);
    }
    
    private void initComponents() {
        setLayout(new GridLayout(1, 2));
        
        PanelControles panelControles = new PanelControles(banco);
        
        JPanel panelInfo = new JPanel();
        JTextArea areaInfo = new JTextArea(20, 25);
        panelInfo.add(areaInfo);
        
  
        add(panelControles);
        add(panelInfo);
      
    }
    
}
