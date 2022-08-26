package com.arquitecturajava.ejemplo001;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Principal7 {

	public static void main(String[] args) {
	
	
			
		Path ruta=Paths.get("micarpeta");
		
		try {
			Stream<Path> st=Files.list(ruta);
			st.filter((p)->p.getFileName().toString().contains("otro"))
			.map((p)->p.getFileName().toString().toUpperCase())
			.forEach(System.out::println);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
