package com.arquitecturajava.ejemplo003.main;

import com.arquitecturajava.ejemplo003.negocio.Deportista;
import com.arquitecturajava.ejemplo003.negocio.Persona;

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
