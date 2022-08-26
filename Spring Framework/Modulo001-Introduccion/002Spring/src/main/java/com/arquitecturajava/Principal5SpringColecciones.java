package com.arquitecturajava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal5SpringColecciones {

	public static void main(String[] args) {

		ApplicationContext contexto = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");

		Persona persona = contexto.getBean(Persona.class);

		System.out.println(persona.getNombre());
		System.out.println(persona.getFactura().getConcepto());
		for (LineaFactura linea : persona.getFactura().getLineas()) {

			System.out.println(linea.getNumero());
			System.out.println(linea.getConcepto());

		}

	}

}
