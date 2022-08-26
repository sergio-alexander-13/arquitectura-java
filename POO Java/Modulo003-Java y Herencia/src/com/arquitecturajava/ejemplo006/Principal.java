package com.arquitecturajava.ejemplo006;

public class Principal {

	public static void main(String[] args) {

		Persona p1= new Deportista("gema","padel");
		
		System.out.println(p1.getNombre());
		p1.andar();
		//siempre almacena un deportista
		Deportista d= (Deportista) p1;
		System.out.println(d.getDeporte());
		

	}

}
