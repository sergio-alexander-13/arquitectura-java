package com.arquitecturajava.webflux1;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.GroupedFlux;
import reactor.core.publisher.Mono;

@RestController
public class FacturasREST {

	@Autowired
	FacturasService servicio;
	
	
	@RequestMapping("/facturas")
	public Flux<Factura> mensajeFacturas() {
		Flux<Factura> flux1= servicio.facturas2();
		//concatWith
		// ejecuta primero el bloque 1 y cuando este termina ejecuta el bloque 2
		// de tal forma que vienen ordenados a nivel asincrono
		return flux1.concatWith(servicio.facturas1());
	}
	

	
	
	
	
}
