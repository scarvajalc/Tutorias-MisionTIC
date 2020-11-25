/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.elecciones;

import com.example.elecciones.entidades.Votante;
import com.example.elecciones.repositorios.RepositorioVotante;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author PC
 */
@Component
public class MainSpring implements CommandLineRunner{
    
    @Autowired
    RepositorioVotante repositorioVotante;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(repositorioVotante.count());
        Optional<Votante> votante1Resultado = repositorioVotante.findById(12332);
        
        if(votante1Resultado.isPresent()) {
            Votante v = (Votante)votante1Resultado.get();
            System.out.println(v);
        } else {
            System.out.println("Votante no encontrado");
        }
        
    }
    
    
    
    
}
