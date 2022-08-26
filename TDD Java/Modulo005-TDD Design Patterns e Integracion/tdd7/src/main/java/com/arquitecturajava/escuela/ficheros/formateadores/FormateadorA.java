package com.arquitecturajava.escuela.ficheros.formateadores;

import java.util.List;

import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Clase;
import com.arquitecturajava.escuela.Nota;

public class FormateadorA implements Formateador {

	@Override
	public Clase getClase(List<String> lineas) {
		Clase miclase= new Clase();

		lineas.removeIf((linea) -> linea.contains("/"));
		
		for (String linea : lineas) {
			
			if (!linea.contains("*")) {
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
				
				Nota nota = new Nota(Double.parseDouble(datosLinea[1]), datosLinea[2]);
				alumno.addNota(nota);
				
			}
			
		}
		
		return miclase;
	}

}
