package com.arquitecturajava.escuela.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lector {
	private File fichero;
	private List<String> lineas = new ArrayList<String>();

	public File getFichero() {
		return fichero;
	}

	public Lector(File fichero) throws FileNotFoundException {
		super();
		// he decidido que en cuanto el lector se construya
		// nos lee los datos
		this.fichero = fichero;
		Scanner scanner = new Scanner(fichero);
		while (scanner.hasNextLine()) {
			
			String linea = scanner.nextLine();
			lineas.add(linea);
			
		}
		scanner.close();
	}

	public String getCabecera() {
		
		return lineas.get(0);
		
	}
	
	public List<String> leer() throws FileNotFoundException {
		
		return lineas;

	}
}
