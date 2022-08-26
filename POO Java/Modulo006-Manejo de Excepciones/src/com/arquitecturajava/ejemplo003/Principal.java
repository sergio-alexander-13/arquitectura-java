package com.arquitecturajava.ejemplo003;

public class Principal {

	public static void main(String[] args) {
		
		//excepcion no checkeada
		Persona p = new Persona();
		p.setNombre("pedro");
		
		if (p!=null) {
			
			System.out.println(p.getNombre());
			
		}
		

	}

}
