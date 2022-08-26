package com.arquitecturajava.ejemplo005;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNombre("pepe");
		Ingeniero i = new Ingeniero();
		i.setNombre("ana");

//		andar(p);
//		andar(i);
		
		List<Persona> lista= new ArrayList<Persona>();
		lista.add(p);
		lista.add(i);
		
		andarTodas(lista);
		
		
		List<Ingeniero> lista2= new ArrayList<Ingeniero>();
		
		lista2.add(i);
		
		//no compila
		
		List<Persona> otraLista= clonarLista(lista);
		
		
		for(Persona pnueva:otraLista) {
			
			System.out.println(pnueva.getNombre());
		}
		
	
	}
	
	//metodo generico apoyandonos en los wildcard para aportar flexibilidad
	public static void andarTodas(List<? extends Persona> milista) {
		
		
		// recorrer personas
		for(Persona p:milista) {
			p.andar();
		}
	}
	
	
	//generico
	public static <T> List<T> clonarLista(List<T> milista) {
		
		List<T> milistaNueva= new ArrayList<T>();
		
		milistaNueva.addAll(milista);
		return milistaNueva;
		
	}
	
	
	
	
	public static void andar(Persona persona) {

		persona.andar();
	}

}
