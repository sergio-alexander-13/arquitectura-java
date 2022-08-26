package com.arquitecturajava.escuela.ficheros.formateadores;

import java.util.List;
import java.util.regex.Pattern;

import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Clase;
import com.arquitecturajava.escuela.Nota;

public class FormateadorB extends Formateador {

	 void procesaFila(Clase clase ,List<Alumno> alumnos, String linea) {
		
		
		if (Pattern.compile("^[A-Za-z]").matcher(linea).find()) {
			// recorre la linea en el caso de que tenga un nombre
			// lo asigna al alumno
			Alumno alumno = new Alumno();
			alumno.setNombre(linea);
			alumnos.add(alumno);

		} else {
			// recorre la linea en el caso de ser una nota

			String[] datosAlumno = linea.split(",");
			Nota nota = new Nota(Double.parseDouble(datosAlumno[0]), datosAlumno[1]);
			Alumno alumno= alumnos.get(alumnos.size()-1);
			alumno.addNota(nota);
		}
		
	}

	 void filtrarLineas(List<String> lineas) {
		lineas.removeIf((linea) -> linea.contains("-"));
		lineas.removeIf((linea) -> linea.contains("*"));
	}

}
