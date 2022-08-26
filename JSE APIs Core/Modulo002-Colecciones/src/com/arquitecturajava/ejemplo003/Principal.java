package com.arquitecturajava.ejemplo003;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		
		List<String> lista= new ArrayList<String>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		
		System.out.println(lista.indexOf("hola"));
		
		lista.set(0, "adios");
		
		System.out.println(lista.get(0));
		
		
		
		
	}

}
