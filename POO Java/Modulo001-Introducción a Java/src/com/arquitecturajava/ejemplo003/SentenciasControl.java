package com.arquitecturajava.ejemplo003;

public class SentenciasControl {

	public static void main(String[] args) {

		int numero = 1;
		if (numero > 5) {

			System.out.println("has aprobado");
		} else if (numero == 5) {
			System.out.println("has aprobado muy justo");

		}

		else {
			if (numero<2) {
				System.out.println("has suspendido de forma exagerada");
			}else {
				System.out.println("has suspendido ");
			}
		}
	}

}
