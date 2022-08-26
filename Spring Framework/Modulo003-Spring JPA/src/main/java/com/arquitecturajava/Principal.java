package com.arquitecturajava;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguradorSpring.class);

		FacturaRepository fr = contexto.getBean(FacturaRepository.class);
		fr.borrar(new Factura(1));
	}

}
