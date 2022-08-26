package com.arquitecturajava.ejemplo006;

public class Coche {

	private String marca;
	private String modelo;
	
	
	public Coche() {
		
		//delegacion de constructores
		this("yaris","toyota");
	
	}
	
	public Coche(String modelo,String marca) {
		
		this.modelo=modelo;
		this.marca=marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
