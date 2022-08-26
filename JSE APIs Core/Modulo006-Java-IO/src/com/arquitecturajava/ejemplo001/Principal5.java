package com.arquitecturajava.ejemplo001;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal5 {

	public static void main(String[] args) {
	
	
			
		Path ruta=Paths.get("mifichero.txt");
		
		
		
		System.out.println(ruta.getFileName());
		System.out.println(ruta.toAbsolutePath());

		Path ruta2=ruta.toAbsolutePath();
		
		for(Path miniruta:ruta2) {
			
			System.out.println(miniruta);
		}
	}

}
