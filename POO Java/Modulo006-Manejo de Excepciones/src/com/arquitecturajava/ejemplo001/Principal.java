package com.arquitecturajava.ejemplo001;

public class Principal {

	public static void main(String[] args) {

		// el programa principal no tiene ninguna
		// clausula try/catch

		// puede acceder a una ventana y mostrar el error
		try {
			Servicio.miMetodo();
		} catch (Exception e) {
			System.out.println("ventana de alerta" + e.getMessage());
		}

	}

}
