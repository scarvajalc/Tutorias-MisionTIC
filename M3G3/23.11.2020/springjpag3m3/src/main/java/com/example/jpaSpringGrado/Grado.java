/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpaSpringGrado;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
//@Table(name = "grado")
public class Grado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id")
    private Integer id;
    //@Column(name = "nombre")
    private String nombre;
    
    public Grado( String nombre) {
        this.nombre = nombre;
    }

    public Grado(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Grado() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Grado{" + "id=" + id + ", nombre=" + nombre + '}' + "\n";
    }
    
    
}
