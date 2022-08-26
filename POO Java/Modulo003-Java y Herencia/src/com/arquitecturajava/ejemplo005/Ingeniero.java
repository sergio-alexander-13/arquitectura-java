package com.arquitecturajava.ejemplo005;

public class Ingeniero extends Persona {

	public Ingeniero(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void andar() {
		
		System.out.println(getNombre()+" camina a 4km/h");
	}

	
}
