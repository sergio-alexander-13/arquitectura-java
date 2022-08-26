package com.arquitecturajava.ejemplo010;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {

	public static void main(String[] args) {
		
		
		String textoFacturas="las facturas son 123AB y 234CD";
		
		String expresion="\\d{3}[A-Z]{2}";
		
		//expresion regular compilada
		Pattern patron= Pattern.compile(expresion);
		Matcher coincidencias=patron.matcher(textoFacturas);
		
		//System.out.println(coincidencias.find());
		
		while(coincidencias.find()) {
			
			// limita el texto que coincide con la expresion regular
			int inicio= coincidencias.start();
			int fin= coincidencias.end();
			System.out.println(textoFacturas.substring(inicio, fin));
			
		}

	}

}
