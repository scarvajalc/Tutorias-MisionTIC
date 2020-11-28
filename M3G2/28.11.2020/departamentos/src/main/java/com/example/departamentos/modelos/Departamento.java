/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.departamentos.modelos;

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
@Table(name = "departamento")
public class Departamento {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long codigo;
    @Column(name = "nombre")
    String nombre;
    String capital;

    public Departamento(Long codigo, String nombre, String capital) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capital = capital;
    }
    
    public Departamento() {
        
    }
    

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    
    
}
