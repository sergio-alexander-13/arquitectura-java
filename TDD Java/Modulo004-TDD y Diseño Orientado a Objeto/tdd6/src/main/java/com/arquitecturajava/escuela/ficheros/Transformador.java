package com.arquitecturajava.escuela.ficheros;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Clase;
import com.arquitecturajava.escuela.Nota;
import com.arquitecturajava.escuela.ficheros.formateadores.Formateador;
import com.arquitecturajava.escuela.ficheros.formateadores.FormateadorA;
import com.arquitecturajava.escuela.ficheros.formateadores.FormateadorB;
import com.arquitecturajava.escuela.ficheros.formateadores.FormateadorStandard;

public class Transformador {

	private Lector lector;

	public Lector getLector() {
		return lector;
	}

	public void setLector(Lector lector) {
		this.lector = lector;
	}

	public Transformador(Lector lector) {
		super();
		this.lector = lector;
	}

	public Clase getClase() throws FileNotFoundException {
		// la clase con todos sus alumnos y notas rellenados

		Clase miclase = new Clase();
		List<String> lineas = lector.leer();
		Formateador formateador = null;
		if (lineas.get(0).contains("*")) {
			formateador = new FormateadorStandard();

		} else if (lineas.get(0).contains("/")) {

			formateador = new FormateadorA();
		} else {

			formateador = new FormateadorB();
		}
		miclase = formateador.getClase(lineas);

		return miclase;

	}

}
