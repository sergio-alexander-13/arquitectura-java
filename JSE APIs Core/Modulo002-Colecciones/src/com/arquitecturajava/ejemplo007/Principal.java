package com.arquitecturajava.ejemplo007;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class Principal {

	public static void main(String[] args) {
	
		//Hashset es un conjunto sin ordenar
		Set<Persona> conjunto= new TreeSet<Persona>();
		Persona p1= new Persona("pepe","perez","madrid");
		Persona p2= new Persona("ana","gomez","barcelona");
		Persona p3= new Persona("juan","sanchez","bilbao");
		
		//olvidar de que salga en el mismo orden que lo insertamos
		conjunto.add(p3);
		conjunto.add(p2);
		conjunto.add(p1);

		for(Persona p:conjunto) {
			
			System.out.println(p.getApellidos());
		}
	}
}
