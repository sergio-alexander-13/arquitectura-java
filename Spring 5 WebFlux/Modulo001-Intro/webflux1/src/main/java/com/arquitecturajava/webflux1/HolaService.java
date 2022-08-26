package com.arquitecturajava.webflux1;

import java.time.Duration;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class HolaService {

	public Mono<String> mensajeHola() {
		
		return Mono.just("hola").delayElement(Duration.ofSeconds(5));
	}
}
