package com.arquitecturajava.escuela.ficheros.formateadores;

import java.util.List;

import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Clase;
import com.arquitecturajava.escuela.Nota;

public class FormateadorStandard extends Formateador {

	 void procesaFila(Clase miclase, List<Alumno> alumnos, String linea) {
		Alumno alumno;
		alumno = new Alumno();

		String[] datosLinea = linea.split(",");
		alumno.setNombre(datosLinea[0]);
		int posicion = alumnos.indexOf(alumno);
		if (posicion == -1) {

			miclase.addAlumno(alumno);
		} else {

			alumno = alumnos.get(posicion);
		}
		
		Nota nota = new Nota(Double.parseDouble(datosLinea[2]), datosLinea[1]);
		alumno.addNota(nota);
	}

	 void filtrarLineas(List<String> lineas) {
		lineas.removeIf((linea) -> linea.contains("*"));
		lineas.removeIf((linea) -> linea.contains("-"));
	}

}
