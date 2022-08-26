package com.arquitecturajava.ejemplo005;

public class Principal {

	public static void main(String[] args) {
		
//		String cadena="hola que tal";
//		
//		System.out.println(cadena.length());
//		
//		for(int i=0;i<cadena.length();i++) {
//			
//			System.out.println(cadena.charAt(i));
//		}
//		System.out.println(cadena.toUpperCase());
//		
		String cadena2="   hola que tal    ";
		String cadena3="hola";
		System.out.println(cadena2);
		System.out.println(cadena2.trim());
		
		String cadena4=cadena2.concat(cadena3);
		System.out.println(cadena4);
		
		String subcadena=cadena2.substring(1, 5);
		System.out.println(subcadena);
		
	}

}
