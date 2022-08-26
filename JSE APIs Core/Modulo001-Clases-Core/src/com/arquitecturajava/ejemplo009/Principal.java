package com.arquitecturajava.ejemplo009;

public class Principal {

	public static void main(String[] args) {
		
		// este seria el bloque de esto sobre el que buscar
		String mensaje="hola que tal estas es 10 de Septiembre";
		//una expresion con un meta caracter
		String[] lista=mensaje.split("\\d{2}");
		
		for(int i=0;i<lista.length;i++) {
			
			System.out.println(lista[i]);
		}
		
		String textoClientes="El cliente A tiene de clave clave1234 "
				+ ", el cliente B tiene clave otraClave3425";
		
		String nuevoTexto= textoClientes.replaceAll("[a-zA-Z]{3,10}\\d{4}", "XXXXXXXXXX");
		System.out.println(nuevoTexto);
		
	}

}
