package com.arquitecturajava.escuela.ficheros.formateadores;

public class FormateadorFactory {

	
	public  static Formateador getInstance(String cabecera) {
		
		Formateador formateador = null;
		if (cabecera.contains("*")) {
			formateador = new FormateadorStandard();

		} else if (cabecera.contains("/")) {

			formateador = new FormateadorA();
		} else {

			formateador = new FormateadorB();
		}
		return formateador;
	}
}
