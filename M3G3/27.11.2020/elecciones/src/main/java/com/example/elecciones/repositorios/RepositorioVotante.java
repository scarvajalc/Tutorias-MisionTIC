/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.elecciones.repositorios;

import com.example.elecciones.entidades.Votante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository
public interface RepositorioVotante extends JpaRepository<Votante, Integer>{
    
}
