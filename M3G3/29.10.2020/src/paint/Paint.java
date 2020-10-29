/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

/**
 *
 * @author PC
 */

public class Paint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo ci1 = new Circulo(new Posicion(0, 0), "Rojo", 5);
        Circulo ci2 = new Circulo(new Posicion(10, 20), "Rojo", 50);
        Circulo ci3 = new Circulo(new Posicion(30, 10), "Rojo", 2);
        Cuadrado cu1 = new Cuadrado(new Posicion(10, 10), "Rojo", 2);
        Cuadrado cu2 = new Cuadrado(new Posicion(30, 10), "Verde", 20);
        
        Escalable[] escalables = new Escalable[10];
        
        Figura[] figuras = {ci1, ci2, ci3, cu1, cu2};
        for (int i = 0; i < figuras.length; i++) {
            figuras[i].pintar();
        }
        
        
        int[][] matriz = new int[2][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        
   
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
            
        }
        
    }
    
}
