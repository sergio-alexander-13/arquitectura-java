package com.arquitecturajava.webflux1;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HolaService {

	public Flux<String> mensajeHola() {

		// Flux<String> flux= Flux.just("hola nuevo").map(e->e.toUpperCase());
		Flux<String> flux = Flux.just("hola nuevo 2").map(String::toUpperCase);
		return flux;
	}

	public Flux<Factura> mensajeFacturas() {

		Factura f1 = new Factura("1", "ordenador", 200);
		Factura f2 = new Factura("2", "movil", 500);
//		Factura f3 = new Factura("3", "tablet", 250);
//		Factura f4 = new Factura("4", "auriculares", 100);
//		
//		Factura f5 = new Factura("5", "ordenador", 200);
//		Factura f6 = new Factura("6", "movil", 500);
//		Factura f7 = new Factura("7", "tablet", 250);
//		Factura f8 = new Factura("8", "auriculares", 100);
		

		Flux<Factura> flux = Flux.just(f1, f2);
		return flux;
	}
}
