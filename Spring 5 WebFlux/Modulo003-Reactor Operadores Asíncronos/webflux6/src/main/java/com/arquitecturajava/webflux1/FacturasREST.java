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
	
	
	@RequestMapping("/facturasMerge")
	public Flux<Factura> mensajeFacturasMerge() {
		Flux<Factura> flux1= servicio.facturas2();
		
		return flux1.mergeWith(servicio.facturas1());
	}
	
	@RequestMapping("/facturaslineas")
	public Flux<Factura> mensajeFacturas2() {
		Flux<Factura> flux1= servicio.facturas1();
		return flux1.concatWith(servicio.facturas2());
	}
	
	@RequestMapping("/lineas")
	public Flux<LineaFactura> mensajeLineas() {
		Flux<Factura> flux1= servicio.facturas1();
		// yo aqui estoy realizando una conversion
		// esa conversión pasa de tener facturas
		// a tener lineas
		//flux facturas a tener  lista de lineas (flux de lineas)
		// from iterable para obtener un flux de lineas
		return flux1.flatMap(f->Flux.fromIterable(f.getLineas()));
	}
	
	@RequestMapping("/lineasTotal")
	public Flux<LineaFactura> mensajeTodasLineas() {
		Flux<Factura> flux1= servicio.facturas1();
		
		Flux<LineaFactura> miflux=flux1.flatMap(f->Flux.fromIterable(f.getLineas()));
		Flux<LineaFactura> miflux2=servicio.facturas2().flatMap(f->Flux.fromIterable(f.getLineas()));
		return miflux.concatWith(miflux2);
	}
	
	
	@RequestMapping("/lineasTotal2")
	public Flux<LineaFactura> mensajeTodasLineas2() {
		return Flux.concat(servicio.facturas1(),servicio.facturas2()).concatMap(f->Flux.fromIterable(f.getLineas()));
		
		
	}
	
	
	@RequestMapping("/lineasTotalBuffer")
	public Flux<List<LineaFactura>> mensajeTodasLineasBuffer() {
		
		//vamos a acumular valores y eso 
		//implica que ya no retornamos un Flux
		return Flux.concat(servicio.facturas1(),servicio.facturas2())
				.concatMap(f->Flux.fromIterable(f.getLineas())).buffer(3);
		
		
	}

	
	@RequestMapping("/lineasTotalBufferTime")
	public Flux<List<LineaFactura>> mensajeTodasLineasBufferTime() {
		
		//vamos a acumular valores y eso 
		//implica que ya no retornamos un Flux
		return Flux.concat(servicio.facturas1(),servicio.facturas2())
				.concatMap(f->Flux.fromIterable(f.getLineas())).buffer(Duration.ofSeconds(6));
		
		
	}
	
	@RequestMapping("/zip")
	public Flux<Integer> mensajeZip() {
		
		//vamos a acumular valores y eso 
		//implica que ya no retornamos un Flux
		return Flux.zip(servicio.facturas1(),servicio.facturas2(),(fa,fb)->fa.getImporte()+fb.getImporte());
				
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
