package com.arquitecturajava.escuela.ficheros.formateadores;

import java.util.List;

import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Clase;

public abstract class Formateador {

	// metodo template define una plantilla de metodos a ejecutar
	
	public Clase getClase(List<String> lineas) {
		Clase miclase = new Clase();
		List<Alumno> alumnos = miclase.getAlumnos();
		// filtra las linea
		filtrarLineas(lineas);
		for (String linea : lineas) {
			// procesa cada una 
			procesaFila(miclase, alumnos, linea);

		}

		return miclase;
	}

	abstract void filtrarLineas(List<String> lineas);

	abstract void procesaFila(Clase clase, List<Alumno> alumnos, String linea);

}
