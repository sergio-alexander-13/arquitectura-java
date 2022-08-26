package com.arquitecturajava.ejemplo002;

public class Principal {

	public static void main(String[] args) {
		
		
		Persona p1=new Persona();
		//no podemos asignar 1000
		p1.setEdad(1000);
		p1.setNombre("pepito");
		System.out.println(p1.getEdad());
		System.out.println(p1.getNombre());

	}

}
