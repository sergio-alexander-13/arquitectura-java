package com.arquitecturajava.webflux1;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HolaService {

	

	public Flux<Factura> mensajeFacturas() {

		WebClient cliente= WebClient.create("http://localhost:8080/facturas");
		
		return cliente.get().retrieve().bodyToFlux(Factura.class); 
	}
}
