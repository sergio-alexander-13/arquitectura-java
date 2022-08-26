package com.arquitecturajava.ejemplo002;

public class Principal {

	public static void main(String[] args) {

		Persona p1= new Persona();
		p1.setNombre("pedro");

		p1.andar();
		
		Deportista d1= new Deportista();
		d1.setNombre("gema");
		d1.andar();

	}

}
