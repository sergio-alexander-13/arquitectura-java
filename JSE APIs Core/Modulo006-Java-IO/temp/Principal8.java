package com.arquitecturajava.ejemplo001;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Principal8 {

	public static void main(String[] args) {
	
	
			
		Path ruta=Paths.get("mifichero.txt");
		
		Path ruta2=Paths.get("micarpeta/mifichero.txt");
		
		
		try {
			
			Stream<Path> st=Files.list(Paths.get("micarpeta"));
			
			st.filter((p)->p.getFileName().toString().contains("1"))
			.map((p)->p.getFileName().toString().toUpperCase())
			.forEach(System.out::println);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
