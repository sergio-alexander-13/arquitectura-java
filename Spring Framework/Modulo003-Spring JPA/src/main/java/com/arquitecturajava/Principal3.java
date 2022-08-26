package com.arquitecturajava;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal3 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
		// el servicio para delegar en el repositorio e insertar
		
		FacturaService servicio= contexto.getBean(FacturaService.class);
		//servicio.insertar(new Factura (5,"raton",30));
		
		servicio.insertarVarios(new Factura (10,"raton",30),new Factura (9,"raton",30));
		
	}

}
