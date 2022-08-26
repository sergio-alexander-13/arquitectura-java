package com.arquitecturajava.main;

import com.arquitecturajava.FactoriaFacturas;
import com.arquitecturajava.Factura;

public class Principal2 {

	public static void main(String[] args) {
		
		// que el que maneja las facturas en el programa
		// main no se da mucha cuenta de si existen clase hijas
		// o no existen todo queda encapsulado a traves del concepto de
		//factura
		
		Factura f1= FactoriaFacturas.getInstance("IVA");
	
		f1.setNumero(1);
		f1.setConcepto("ordenador");
		f1.setImporte(200);
		System.out.println(f1.getImporteTotal());
		
		Factura f2= FactoriaFacturas.getInstance("SinIVA");
		f2.setNumero(1);
		f2.setConcepto("ordenador");
		f2.setImporte(200);
		System.out.println(f2.getImporteTotal());
		

	
	}
	
	
	

}
