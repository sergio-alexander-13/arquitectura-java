package com.arquitecturajava;

public class FacturaProxy extends Factura {

	private Factura factura;
	
	
	public int getNumero() {
		return factura.getNumero();
	}
	public void setNumero(int numero) {
		factura.setNumero(numero);
	}
	public String getConcepto() {
		return factura.getConcepto();
	}
	public void setConcepto(String concepto) {
		factura.setConcepto(concepto);
	}
	public double getImporte() {
		return factura.getImporte();
	}
	public void setImporte(double importe) {
		factura.setImporte(importe);
	}
	public FacturaProxy(FacturaSinIVA factura) {
		
		this.factura=factura;
	}
	@Override
	public double getImporteTotal() {
		// añade comportamiento adicional
		// pero ademas delega
		System.out.println("ojo se ha creado una factura sin IVA");
		return factura.getImporteTotal();
	}

}
