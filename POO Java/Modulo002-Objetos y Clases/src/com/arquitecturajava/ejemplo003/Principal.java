package com.arquitecturajava.ejemplo003;

public class Principal {

	public static void main(String[] args) {
		
		
		Libro l1= new Libro();
		l1.setTitulo("el juego de ender");
		l1.setTotalPaginas(200);
		
		System.out.println(l1.getPaginaActual());
		l1.avanzarPagina();
		System.out.println(l1.getPaginaActual());
		l1.avanzarPagina();
		System.out.println(l1.getPaginaActual());
		
		
		l1.avanzarCapitulo();
		
		System.out.println(l1.getPaginaActual());
	}

}
