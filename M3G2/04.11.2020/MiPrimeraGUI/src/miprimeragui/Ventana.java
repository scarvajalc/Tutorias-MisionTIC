/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeragui;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author PC
 */
public class Ventana extends JFrame{
    public JPanel panel1;
    
    public Ventana() {
        super("Mi Ventana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        inicializarComponentes();
        pack();
        setVisible(true);
    }
    
    public void inicializarComponentes() {
        // Establece el aspecto de la distribución utilizada
        
        
        panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);
        panel1.add(new JLabel("Panel 1"));
        agregarComponentealPanel1();
        add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.RED);
        panel2.add(new JLabel("Panel 2"));
        add(panel2);
        
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        panel3.add(new JLabel("Panel 3"));
        panel3.add(new JButton("Soy un Boton"));
        add(panel3);
    }
    
    public void agregarComponentealPanel1(){
        panel1.add(new JButton("Hola"));
    }
    
}
