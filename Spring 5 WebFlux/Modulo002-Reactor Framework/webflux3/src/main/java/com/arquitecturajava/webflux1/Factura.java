package com.arquitecturajava.webflux1;

public class Factura {

	private String numero;
	private String concepto;
	private int importe;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public Factura(String numero, String concepto, int importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}
	public Factura() {
		super();
	}
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", concepto=" + concepto + ", importe=" + importe + "]";
	}
	
	
}
