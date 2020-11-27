/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.elecciones.entidades;

import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.transaction.Transactional;

/**
 *
 * @author PC
 */
@Entity
public class Candidato {
    @Id
    Integer cedula;
    @Column(name = "nombre")
    String nombre;
    String partido;
    String genero;
    //@OneToMany(fetch = FetchType.EAGER, mappedBy = "candidato", cascade = CascadeType.ALL)
    //List<Votante> votantes;
    

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /*public Set<Votante> getVotantes() {
        return votantes;
    }

    public void setVotantes(Set<Votante> votantes) {
        this.votantes = votantes;
    }*/

    @Override
    public String toString() {
        return "Candidato{" + "cedula=" + cedula + ", nombre=" + nombre + ", partido=" + partido + ", genero=" + genero  + '}';
    }
     
    
   
}
