package com.arquitecturajava.ejemplo001;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal6 {

	public static void main(String[] args) {
	
	
			
		Path ruta=Paths.get("mifichero.txt");
		Path rutaDestino=Paths.get("micarpeta/mifichero.txt");
		try {
			// para gestionar el movimiento copia y borrado de ficheros de disco
			Files.copy(ruta, rutaDestino);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
