package com.arquitecturajava.ejemplo002;

public class Principal {

	public static void main(String[] args) {
		
		Tarea t= new Tarea();
		Tarea t2= new Tarea();
		Tarea t3= new Tarea();
		
		Thread hilo1= new Thread(t,"A");
		Thread hilo2= new Thread(t,"B");
		Thread hilo3= new Thread(t,"C");
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}

}
