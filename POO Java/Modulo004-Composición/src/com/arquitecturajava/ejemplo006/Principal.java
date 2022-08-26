package com.arquitecturajava.ejemplo006;

public class Principal {

	public static void main(String[] args) {
		
		
		Persona carlos= new Persona("carlos");
		Persona gema= new Persona("gema");
		Persona miguel= new Persona("miguel");
		
		miguel.addAmigo(gema);
		miguel.addAmigo(carlos);
		
		for (Persona p: miguel.getAmigos()) {
			
			System.out.println(p.getNombre());
		}

	}

}
