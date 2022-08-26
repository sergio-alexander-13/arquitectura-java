package com.arquitecturajava;

public class LineaFactura {

	private int numero;
	private String concepto;
	private String importe;
	
	
	public LineaFactura() {
		super();
	}
	public LineaFactura(int numero, String concepto, String importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getImporte() {
		return importe;
	}
	public void setImporte(String importe) {
		this.importe = importe;
	}
}
