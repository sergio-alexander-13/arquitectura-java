package com.arquitecturajava;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal3 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguradorSpring.class);

		FacturaService fs = contexto.getBean(FacturaService.class);
		// un error de primary key duplicada es decir la factura 2 ya existe
		// y no puede insertar la 3 porque es una transaccion se ejecutan
		//todas o ninguna
		fs.insertarVarios(new Factura(3, "ordenador", 200), new Factura(2, "tablet", 100));

	}

}
