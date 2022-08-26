package com.arquitecturajava.webflux1;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HolaService {

	@Autowired
	HolaRepository repositorio;
	
	public Flux<String> mensajeHola() {
		
		Flux<String> flux= Flux.concat(repositorio.hola(),repositorio.hola());
		
		return flux;
	}
}
