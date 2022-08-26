package com.arquitecturajava;

 class FacturaSinIVA extends Factura {

	
	public FacturaSinIVA() {
		super();
		// no no tiene ninguna traza
	}

	public FacturaSinIVA(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteTotal() {
		// TODO Auto-generated method stub
		return this.getImporte();
	}

}
