package com.arquitecturajava.ejemplo001;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal7 {

	public static void main(String[] args) {
	
	
			
		Path ruta=Paths.get("mifichero.txt");
		
		Path ruta2=Paths.get("micarpeta/mifichero.txt");
		try {
			Files.copy(ruta, ruta2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
