package com.arquitecturajava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal2Spring {

	public static void main(String[] args) {
		
		// el contexto de la aplicacion
		// para dar de alta y acceder a los diferentes objetos
		// que mi aplicacion necesita.
		ApplicationContext contexto= new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		
		Factura factura=contexto.getBean(FacturaConIVA.class);
		
		System.out.println(factura.getNumero());
		System.out.println(factura.getConcepto());
		System.out.println(factura.getImporte());
		
		

	}

}
