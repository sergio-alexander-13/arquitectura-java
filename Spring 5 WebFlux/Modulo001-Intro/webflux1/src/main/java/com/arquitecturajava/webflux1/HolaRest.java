package com.arquitecturajava.webflux1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HolaRest {

	@Autowired
	HolaService servicio;
	
	@RequestMapping("/hola")
	public Mono<String> mensajeHola() {
		
		return servicio.mensajeHola();
	}
}
