package com.arquitecturajava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguradorSpring {

	@Bean
	public Persona getPersona() {
		Persona persona= new Persona();
		persona.setNombre("ana");
		return persona;
	}
}
