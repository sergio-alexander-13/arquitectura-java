package com.arquitecturajava.webflux1;

import java.time.Duration;

import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;
@Repository
public class HolaRepository {

	
public Mono<String> hola() {
		
		return Mono.just("hola").delayElement(Duration.ofSeconds(5));
	}
}
