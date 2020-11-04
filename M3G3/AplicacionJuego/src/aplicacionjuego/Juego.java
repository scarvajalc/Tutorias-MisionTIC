/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionjuego;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Juego {
    private char[][] mapa;
    private ArrayList<Elemento> historialDeElementos;
    
    public Juego() {
        mapa = new char[10][10];
        historialDeElementos = new ArrayList<Elemento>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mapa[i][j] = '-';
            }
        }
    }
    
    public void procesarComandos(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            String comando = scanner.nextLine();
            String[] datosComando = comando.split("\\*");
            opcion = Integer.parseInt(datosComando[0]);
            if (opcion == 1) {
                String tipoElemento = datosComando[1];
                int x = Integer.parseInt(datosComando[2]);
                int y = Integer.parseInt(datosComando[3]);
                boolean vivo = Boolean.parseBoolean(datosComando[4]);
                int puntosVida = Integer.parseInt(datosComando[5]);
                Elemento elemento;
                if (tipoElemento.equals("Muro")) {
                    int resistencia = Integer.parseInt(datosComando[6]);
                    elemento = new Muro(x, y, puntosVida, vivo, resistencia);
                } else if (tipoElemento.equals("Aliado")) {
                    int puntosMana = Integer.parseInt(datosComando[6]);
                    int puntosAtaque = Integer.parseInt(datosComando[7]);
                    elemento = new Aliado(x, y, puntosVida, vivo, puntosMana, puntosAtaque);   
                }else {
                    boolean venenoso = Boolean.parseBoolean(datosComando[6]);
                    elemento = new Enemigo(x, y, puntosVida, vivo, venenoso);  
                }
                agregarElemento(elemento);
            } else if (opcion == 2) {
                mostrarMapa();
                mostarResumen();
            }
        }while(opcion != 2);
        
    }
    
    public void agregarElemento(Elemento elemento){
        mapa[elemento.getX()][elemento.getY()] = elemento.getCaracter();
        historialDeElementos.add(elemento);
    }
    
    public void mostrarMapa(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(mapa[i][j] + " ") ;
            }
            System.out.println("");
        }
    }
    
    public void mostarResumen(){
        for (int i = 0; i < historialDeElementos.size(); i++) {
            System.out.println(historialDeElementos.get(i));
        }
    }
    
}
