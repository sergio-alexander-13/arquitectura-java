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
	private Formateador formateador;
	
	public Formateador getFormateador() {
		return formateador;
	}

	public void setFormateador(Formateador formateador) {
		this.formateador = formateador;
	}

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
	
	public Transformador(Lector lector,Formateador formateador) {
		super();
		this.lector = lector;
		this.formateador=formateador;
	}

	public Clase getClase() throws FileNotFoundException {
		
		
		

		Clase miclase = new Clase();
		List<String> lineas = lector.leer();
		/*
		
		*/
		miclase = formateador.getClase(lineas);

		return miclase;

	}

}
