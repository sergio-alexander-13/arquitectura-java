package com.arquitecturajava.escuela.ficheros.formateadores;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Clase;
import com.arquitecturajava.escuela.Nota;

public class FormateadorB implements Formateador {

	@Override
	public Clase getClase(List<String> lineas) {
		Clase miclase= new Clase();
		List<Alumno> alumnos = new ArrayList<Alumno>();
		lineas.removeIf((linea) -> linea.contains("-"));
		
		Alumno alumno=null;
		for (String linea : lineas) {

			if (!linea.contains("*")) {

				if (Pattern.compile("^[A-Za-z]").matcher(linea).find()) {
					//recorre la linea en el caso de que tenga un nombre
					// lo asigna al alumno
					alumno = new Alumno();
					alumno.setNombre(linea);
					alumnos.add(alumno);

				} else {
					//recorre la linea en el caso de ser una nota
					
					String[] datosAlumno = linea.split(",");
					Nota nota = new Nota(Double.parseDouble(datosAlumno[0]), datosAlumno[1]);
					alumno.addNota(nota);
				}

			}

		}
		
		miclase.setAlumnos(alumnos);
		
		return miclase;
	}

}
