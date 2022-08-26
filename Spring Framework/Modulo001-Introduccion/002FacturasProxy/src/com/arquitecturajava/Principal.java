package com.arquitecturajava;

public class Principal {

	public static void main(String[] args) {

		//factoria que decide que clase se usa
		// dentro de la jerarquia
		Factura f = FactoriaFacturas.getInstance("SinIVA");

		f.setNumero(1);
		f.setImporte(200);
		f.setConcepto("tablet");

		System.out.println(f.getImporteTotal());

	}

}
