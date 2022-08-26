package com.arquitecturajava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal1Spring {

	public static void main(String[] args) {
		
		// el contexto de la aplicacion
		// para dar de alta y acceder a los diferentes objetos
		// que mi aplicacion necesita.
		AnnotationConfigApplicationContext contexto= new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
		Persona persona= contexto.getBean(Persona.class);
		
		System.out.println(persona.getNombre());
		
		

	}

}
