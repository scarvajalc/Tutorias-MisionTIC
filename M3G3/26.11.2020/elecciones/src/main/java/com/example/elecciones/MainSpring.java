/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.elecciones;

import com.example.elecciones.entidades.Votante;
import com.example.elecciones.repositorios.RepositorioCandidato;
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
    
    @Autowired
    RepositorioCandidato repositorioCandidato;

    @Override
    public void run(String... args) throws Exception {
        //int cedulaCandidatoSanti = repositorioVotante.findById(666).get().getCedulaCandidato();
        //String nombreCandidatoVotadoPorSanti = repositorioCandidato.findById(cedulaCandidatoSanti).get().getNombre();
        //System.out.println("Santi voto por " + nombreCandidatoVotadoPorSanti);
        
        String nombreCandidatoVotadoPorSantiDirecto = repositorioVotante.findById(666).get().getCandidato().getNombre();
        System.out.println("Santi voto por " + nombreCandidatoVotadoPorSantiDirecto);
        
    }
    
    
    
    
}
