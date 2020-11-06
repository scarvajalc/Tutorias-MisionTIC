/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6nov;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Hilo extends Thread{
    
    @Override
    public void run(){
        
        synchronized(this) {
            System.out.println("Linea 1");
            System.out.println("Linea 2");
            System.out.println("Linea 3");
            try {
                wait(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Linea 4");
            System.out.println("Linea 5");
            
            
        }
        
        
    }
    
}
