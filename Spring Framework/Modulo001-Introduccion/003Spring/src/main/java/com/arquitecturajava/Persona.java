package com.arquitecturajava;

public class Persona {

	private String nombre;
	private Factura factura;
	
	
	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, Factura factura) {
		super();
		this.nombre = nombre;
		this.factura = factura;
	}

	public Persona() {
		super();
	}
	
	
}
