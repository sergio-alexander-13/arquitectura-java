package com.arquitecturajava.ejemplo005;

public class FiltroLibros {

	public static boolean cienciaFiccion(Libro l) {

		return l.getCategoria().equals("ciencia ficcion");
	}

	public static boolean libroCaro(Libro l) {

		if (l.getPrecio() > 15) {
			return true;
		} else {
			return false;
		}
	}
}
