package com.arquitecturajava.webflux1;

public class Noticia {

	private String texto;
	private int lectores;
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getLectores() {
		return lectores;
	}
	public void setLectores(int lectores) {
		this.lectores = lectores;
	}
	public Noticia(String texto, int lectores) {
		super();
		this.texto = texto;
		this.lectores = lectores;
	}
	public Noticia() {
		super();
	}

	
	
}
