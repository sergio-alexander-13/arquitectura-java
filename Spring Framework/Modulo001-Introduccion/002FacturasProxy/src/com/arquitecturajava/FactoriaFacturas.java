package com.arquitecturajava;

public class FactoriaFacturas {

	public static Factura getInstance(String tipo) {
		
		if (tipo.equals("IVA")) {
			
			return new FacturaConIVA();
		}else {
			
			return new FacturaProxy(new FacturaSinIVA());
		}
	}
}
