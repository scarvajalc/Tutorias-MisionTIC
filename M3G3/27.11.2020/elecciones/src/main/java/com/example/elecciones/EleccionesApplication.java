package com.example.elecciones;

import com.example.elecciones.vistas.Ventana;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EleccionesApplication {

	public static void main(String[] args) {
		new Ventana().setVisible(true);
	}
        
        public static void iniciarSpring() {
               SpringApplication.run(EleccionesApplication.class);

        }

}
