package com.arquitecturajava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal1Spring {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contexto= new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
		Servicio servicio= contexto.getBean(Servicio.class);
	
		servicio.mensaje();
		

	}

}
