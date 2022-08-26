package com.arquitecturajava;

 class FacturaConIVA extends Factura {

	
	
	public FacturaConIVA() {
		super();
	
	}

	public FacturaConIVA(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		
	
	}

	@Override
	public double getImporteTotal() {
		// TODO Auto-generated method stub
		return this.getImporte()*1.21;
	}

}
