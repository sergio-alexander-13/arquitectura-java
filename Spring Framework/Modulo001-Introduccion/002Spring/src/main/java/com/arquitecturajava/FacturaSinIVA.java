package com.arquitecturajava;

 class FacturaSinIVA extends Factura {

	
	public FacturaSinIVA() {
		super();
		// TODO Auto-generated constructor stub
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
