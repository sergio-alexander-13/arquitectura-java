package com.arquitecturajava.ejemplo001;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		
		
		ArrayList<String> lista= new ArrayList<String>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		
		// un iterable es algo que se puede recorrer
		Iterable<String> miIterable= lista;
		
		// el encargado de recorrerlo
		Iterator<String> it=miIterable.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			it.remove();
		
		}
//		it=miIterable.iterator();
//		
//		while(it.hasNext()) {
//			
//			System.out.println(it.next());
//			
//		}
//		
		
		for(String cadena:lista){
			
			System.out.println(cadena);
		}
		
		
	}
}
