package com.arquitecturajava.ejemplo005;

public class Principal {

	public static void main(String[] args) {
		
		
		long t1= System.currentTimeMillis();
		Trabajador t= new Trabajador(0);
		Tarea mitarea= new Tarea(t,5);
		Thread hilo= new Thread(mitarea);
		hilo.start();
		Tarea mitarea2= new Tarea(t,4);
		Thread hilo2= new Thread(mitarea2);
		hilo2.start();
		
		try {
			hilo.join();
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long t2= System.currentTimeMillis();
		
		System.out.println(t2-t1);
		
	
		

	}

}
