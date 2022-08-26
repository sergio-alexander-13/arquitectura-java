package com.arquitecturajava;

 class FacturaConIVA extends Factura {

	
	
	public FacturaConIVA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacturaConIVA(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteTotal() {
		// TODO Auto-generated method stub
		return this.getImporte()*1.21;
	}

}
