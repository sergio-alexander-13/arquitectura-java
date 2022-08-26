package com.arquitecturajava.ejemplo002;

import java.util.ArrayList;
import java.util.Collection;

public class Principal {

	public static void main(String[] args) {
		
		
		Collection<String> lista= new ArrayList<String>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		
		System.out.println(lista.contains("tal"));
		
		lista.addAll(lista);
		
		System.out.println(lista.size());
		
		
		//porque usar este y no iterable e iterator
		//foreach 
		for(String cadena:lista) {
			
			System.out.println(cadena);
		}
		
		System.out.println(lista.isEmpty());
		//lista.clear();
		System.out.println(lista.isEmpty());
		lista.remove("que");
		System.out.println("*******************");
		for(String cadena:lista) {
			
			System.out.println(cadena);
		}
		
		
	}

}
