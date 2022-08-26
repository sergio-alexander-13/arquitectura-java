package com.arquitecturajava.ejemplo003;

public class Galleta implements Producto {

	private String sabor;
	private double precio;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Galleta(String sabor,double precio) {
		super();
		this.sabor = sabor;
		this.precio=precio;
	}
	
	
}
