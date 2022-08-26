package com.arquitecturajava.escuela.ficheros.formateadores;

import java.util.List;

import com.arquitecturajava.escuela.Clase;

public interface Formateador {

	public Clase getClase(List<String> lineas);
}
