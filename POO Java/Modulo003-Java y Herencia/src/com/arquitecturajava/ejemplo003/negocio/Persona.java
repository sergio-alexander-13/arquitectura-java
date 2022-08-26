package com.arquitecturajava.ejemplo003.negocio;

public class Persona {

	private String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//nuevo metodo
	  void imprimeTextoAndar() {
		
		System.out.print(getNombre()+" camina a");
	}

	public void andar() {
		imprimeTextoAndar();
		System.out.println(" 5 km/h");
	}
	
}
