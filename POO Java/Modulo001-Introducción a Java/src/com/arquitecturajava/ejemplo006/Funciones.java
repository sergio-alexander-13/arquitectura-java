package com.arquitecturajava.ejemplo006;

public class Funciones {

	public static void main(String[] args) {

		// inteligente
		holas();

		adios();

		// inteligente
		holas();

	}

	private static void adios() {
		mensaje("adios", 4);
	}

	private static void holas() {
		mensaje("holas", 4);
	}

	private static void mensaje(String mensaje, int repeticiones) {

		for (int i = 0; i < repeticiones; i++) {
			System.out.println(mensaje);
		}
	}

}
