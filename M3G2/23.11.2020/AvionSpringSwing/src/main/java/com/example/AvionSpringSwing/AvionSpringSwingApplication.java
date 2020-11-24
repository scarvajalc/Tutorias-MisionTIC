package com.example.AvionSpringSwing;

import com.example.AvionSpringSwing.vistas.Ventana;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AvionSpringSwingApplication {

	public static void main(String[] args) {
                new Ventana().setVisible(true);
	}
        
        public static void ejecutarSpring() {
            SpringApplication.run(AvionSpringSwingApplication.class);
        }
        

}
