package com.arquitecturajava.ejemplo007;

public class Ordenador {

	private String marca;
	private int precio;
	private int disco;
	private int memoria;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;  
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getDisco() {
		return disco;
	}
	public void setDisco(int capacidadDisco) {
		this.disco = capacidadDisco;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public Ordenador(String marca, int precio, int capacidadDisco, int memoria) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.disco = capacidadDisco;
		this.memoria = memoria;
	}
	public Ordenador() {
		super();
	}
	
}

