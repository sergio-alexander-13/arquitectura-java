package com.arquitecturajava.escuela.ficheros;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Clase;
import com.arquitecturajava.escuela.Nota;

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

		List<Alumno> alumnos = new ArrayList<Alumno>();
		Clase miclase = new Clase();
		List<String> lineas = lector.leer();
		
		
		lineas.removeIf((linea) -> linea.contains("*"));

		for (String linea : lineas) {

			if (!linea.contains("-")) {
				String[] datosLinea = linea.split(",");
				
				Alumno alumno = new Alumno();
				alumno.setNombre(datosLinea[0]);
				// accedo a la posicion del alumno
				int posicion=miclase.getAlumnos().indexOf(alumno);
				// si el alumno no existe devuelve -1
				if(posicion==-1) {
					//añadimos el alumno a la lista
					miclase.addAlumno(alumno);
				}else {
					//pues obtenemos el alumno que hay en la lista
					alumno=miclase.getAlumnos().get(posicion);
				}
				
				Nota nota = new Nota(Double.parseDouble(datosLinea[2]), datosLinea[1]);
				alumno.addNota(nota);
				
			}

		}
		return miclase;

	}

}
