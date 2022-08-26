package com.arquitecturajava.ejemplo003;

public class Principal {

	public static void main(String[] args) {
		
		
	
		Trabajador t= new Trabajador(0);
		Tarea mitarea= new Tarea(t,5);
		Thread hilo= new Thread(mitarea);
		hilo.start();
		Tarea mitarea2= new Tarea(t,4);
		Thread hilo2= new Thread(mitarea2);
		hilo2.start();
		

	}

}
