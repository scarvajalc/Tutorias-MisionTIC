/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.AvionSpringSwing.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.AvionSpringSwing.modelos.Avion;

/**
 *
 * @author PC
 */
@Repository
public interface RepositorioAvion extends JpaRepository<Avion, Integer>{
    
}
