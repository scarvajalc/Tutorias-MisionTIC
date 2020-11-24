package com.example.jpaSpringGrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaSpringGradoApplication {

	public static void main(String[] args) {
		
                new Ventana().setVisible(true);
                
	}
        
        public static void iniciarSpring() {
            SpringApplication.run(JpaSpringGradoApplication.class);
        }

}
