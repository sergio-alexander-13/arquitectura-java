package com.arquitecturajava.ejemplo006;

public class Principal {

	public static void main(String[] args) {

		long numero1 = System.currentTimeMillis();

		String cadena = "hola";
		System.out.println(cadena);
		//no hay problemas de concurrencia 
		StringBuffer sb = new StringBuffer();
		sb.append(cadena);
		//si los puede haber 
		StringBuilder sb1= new StringBuilder();
		
		for (int i = 0; i < 50000; i++) {

			sb.append("hola");
			sb.append(i);
		}

		long numero2 = System.currentTimeMillis();
		System.out.println(numero2 - numero1);
		System.out.println(sb.toString());
	}

}
