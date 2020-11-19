/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author PC
 */
public class Asignatura {
    int id;
    String nombre;
    int creditos;
    String tipo;
    int curso;
    int cuatrimestre;

    public Asignatura(int id, String nombre, int creditos, String tipo, int curso, int cuatrimestre) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        this.tipo = tipo;
        this.curso = curso;
        this.cuatrimestre = cuatrimestre;
    }

    @Override
    public String toString() {
        return id + "\t" + nombre + "\t" + creditos + "\t" + tipo + "\t" + curso + "\t" + cuatrimestre;
        //return "Asignatura{" + "id=" + id + ", nombre=" + nombre + ", creditos=" + creditos + ", tipo=" + tipo + ", curso=" + curso + ", cuatrimestre=" + cuatrimestre + '}';
    }
    
    
    
}
