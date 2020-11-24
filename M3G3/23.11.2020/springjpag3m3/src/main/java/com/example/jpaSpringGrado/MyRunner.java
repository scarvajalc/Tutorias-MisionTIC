/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpaSpringGrado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author PC
 */
@Component
public class MyRunner implements CommandLineRunner{
    
    @Autowired
    RepositorioGrado repositorioGrado;
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola Mundo");
        System.out.println("La tabla grado tiene" + repositorioGrado.count() + " registros");
        System.out.println(repositorioGrado.findAll());
        Grado grado = new Grado(2224, "XYZGrado en Spring(Nivel megamegamegamegadificil)");
        repositorioGrado.save(grado);
        repositorioGrado.delete(new Grado(14, "sdfsdf"));
        repositorioGrado.save(new Grado(1, "Gradoo sdfsdf"));
       
    }
    
}
