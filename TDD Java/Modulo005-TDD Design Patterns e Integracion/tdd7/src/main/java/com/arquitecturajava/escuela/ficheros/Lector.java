package com.arquitecturajava.escuela.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lector {
	private File fichero;

	public File getFichero() {
		return fichero;
	}

	public void setFichero(File fichero) {
		this.fichero = fichero;
	}

	public Lector(File fichero) {
		super();
		this.fichero = fichero;
	}

	public List<String> leer() throws FileNotFoundException {

		List<String> lineas = new ArrayList<String>();

		Scanner scanner = new Scanner(fichero);
		while (scanner.hasNextLine()) {

			String linea = scanner.nextLine();
			lineas.add(linea);

		}
		scanner.close();
		return lineas;

	}
}
