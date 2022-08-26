package com.arquitecturajava.ejemplo004;

public class Persona {

	private String nombre;
	
	
	
	// al constructor de la clase padre
	// clase padre es la clase object 
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void andar() {
		
		System.out.println(getNombre()+" camina a 5 km/h");
	}
	
}
