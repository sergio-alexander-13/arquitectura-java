package com.arquitecturajava.plantillas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import com.arquitecturajava.webflux1.Factura;

import reactor.core.publisher.Flux;

@Controller
public class FacturasController {

	@Autowired
	HolaService miservicio;
	
	@RequestMapping("/facturas")
	public String facturas(final Model modelo) {
		
		Flux<Factura> miflux= miservicio.mensajeFacturas();
		
		IReactiveDataDriverContextVariable variableReactiva=new ReactiveDataDriverContextVariable(miflux);
		
		modelo.addAttribute("facturas",variableReactiva);
		return "facturas";
	}
}
