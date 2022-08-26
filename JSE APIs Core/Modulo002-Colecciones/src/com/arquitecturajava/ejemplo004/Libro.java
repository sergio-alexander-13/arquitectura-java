package com.arquitecturajava.ejemplo004;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Libro {

	private String titulo;
	private String autor;
	
	//relacion entre ambas clases
	private List<Capitulo> listaCapitulos;
	
	
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.listaCapitulos=new ArrayList<Capitulo>();
	}
	
	public boolean contieneCapitulo(Capitulo c) {
		
		return listaCapitulos.contains(c);
	}
	
	public boolean cambiarCapitulo(Capitulo viejo,Capitulo nuevo){
		
		int posicion= listaCapitulos.indexOf(viejo);
		listaCapitulos.set(posicion, nuevo);
		if (posicion!=-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<Capitulo> getListaCapitulos() {
		return listaCapitulos;
	}

	public void addCapitulo(Capitulo c) {
		
		//interface de collection
		listaCapitulos.add(c);
	}
	
	public int totalPaginas() {
		int total=0;
		
		//foreach internamente esta usando el iterador
		for(Capitulo c:listaCapitulos) {
			
			total=total+ c.getPaginas();
		}
		
	
		
		return total;
		
	}

	public int totalCapitulos() {
		//se apoya en size que pertenece al interface de collection
		return listaCapitulos.size();
	}
	

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}
}
