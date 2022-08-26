package com.arquitecturajava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FacturasController {
	
	@Autowired
	FacturaService servicio;
	
	//sirve para comunicar datos desde el controlador a la lista
	// y tiene una estructura parecida a una tabla hash
	@RequestMapping("/listaFacturas")
	public String listaFacturas(Model modelo) {
		
		List<Factura> lista=servicio.buscarTodas();
		modelo.addAttribute("listaFacturas", lista);
		return "listaFacturas";
	}
	@RequestMapping("/formularioNuevaFactura")
	public String formularioNuevaFactura(Model modelo) {
		modelo.addAttribute("factura",new Factura());
		return "formularioNuevaFactura";
		
		
		
	}
	
	@RequestMapping("/formularioInsertarFactura")
	public String formularioNuevaFactura(Model modelo, @ModelAttribute Factura factura) {
		
		servicio.insertar(factura);
		List<Factura> lista=servicio.buscarTodas();
		modelo.addAttribute("listaFacturas", lista);
		return "listaFacturas";
		
		
		
	}
	@RequestMapping("/borrarFactura")
	public String borrarFactura(@RequestParam("numero") int numero,Model modelo) {
		
		servicio.borrar(new Factura (numero));
		List<Factura> lista= servicio.buscarTodas();
		modelo.addAttribute("listaFacturas",lista);
		return "listaFacturas";
		
		
	}
	@RequestMapping("/formularioEditarFactura")
	public String formularioEditarFactura(@RequestParam("numero") int numero , Model modelo) {
		
		// aqui lo que hago es leo el parametro que me llega del link de editar
		// y busco la factura en la base de datos
		// cargo en el modelo la factura a presentar
		modelo.addAttribute("factura",servicio.buscarUna(numero));
		// solicito ir al formulario
		return "formularioEditarFactura";
		
	}
	
	@RequestMapping("/formularioSalvarFactura")
	public String formularioSalvarFactura(Model modelo, @ModelAttribute Factura factura) {
		
		servicio.actualizar(factura);
		List<Factura> lista=servicio.buscarTodas();
		modelo.addAttribute("listaFacturas", lista);
		return "listaFacturas";
		
		
		
	}
}
