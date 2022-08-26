package com.arquitecturajava.ejemplo005;

import java.util.HashSet;

public class Principal {

	public static void main(String[] args) {
	
		
		HashSet<String> conjunto= new HashSet<String>();
		HashSet<Persona> conjunto2= new HashSet<Persona>();
		conjunto.add("hola");
		conjunto.add("que");
		conjunto.add("tal");
		conjunto.add("hola");
		
		
		// no sale ordenado 
		for(String cadena:conjunto) {
			
			System.out.println(cadena);
		}
		
		
		Persona p1= new Persona("pedro");
		Persona p2=new Persona ("juan");
		Persona p3=new Persona ("juan");
		conjunto2.add(p1);
		conjunto2.add(p2);
		conjunto2.add(p3);
		
		for(Persona p:conjunto2) {
			
			System.out.println(p.getNombre());
		}
	}

}
