/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.AvionSpringSwing.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "avion")
public class Avion {
    
    @Id
    @Column(name="numero_registro_unico")
    Integer numeroRegistroUnico;
    
    
    @Column(name="modelo")
    String modelo; 
    
    Integer capacidad;

    public Avion(Integer numeroRegistroUnico, String modelo, Integer capacidad) {
        this.numeroRegistroUnico = numeroRegistroUnico;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    public Avion() {
        
    }
    
    @Override
    public String toString() {
        return "Avion{" + "numeroRegistroUnico=" + numeroRegistroUnico + ", modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }

    public Integer getNumeroRegistroUnico() {
        return numeroRegistroUnico;
    }

    public void setNumeroRegistroUnico(Integer numeroRegistroUnico) {
        this.numeroRegistroUnico = numeroRegistroUnico;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    
}
