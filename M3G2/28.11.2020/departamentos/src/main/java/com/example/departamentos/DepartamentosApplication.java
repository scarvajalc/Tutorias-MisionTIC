package com.example.departamentos;

import com.example.departamentos.vistas.Ventana;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartamentosApplication {

	public static void main(String[] args) {
             
            new Ventana().setVisible(true);
		
	}
        
        public static void iniciarSpring() {
           SpringApplication.run(DepartamentosApplication.class);
        }

   

}
