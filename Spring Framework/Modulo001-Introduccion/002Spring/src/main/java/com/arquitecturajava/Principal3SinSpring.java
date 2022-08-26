package com.arquitecturajava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal3SinSpring {

	public static void main(String[] args) {
	
		
		Factura f= FactoriaFacturas.getInstance("SinIVA");
		
		f.setNumero(1);
		f.setImporte(200);
		f.setConcepto("tablet");
		
		System.out.println(f.getImporteTotal());
		
	
		
		
		

	}

}
