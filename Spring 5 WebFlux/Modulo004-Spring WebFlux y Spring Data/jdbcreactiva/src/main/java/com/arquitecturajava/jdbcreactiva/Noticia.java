package com.arquitecturajava.jdbcreactiva;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(value="noticias")
public class Noticia {
	@Id
	private int id;
	private String texto;
	private int lectores;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	
	public Noticia() {
		super();
	}
	public Noticia(int id, String texto, int lectores) {
		super();
		this.id = id;
		this.texto = texto;
		this.lectores = lectores;
	}
	
	
	
	
}
