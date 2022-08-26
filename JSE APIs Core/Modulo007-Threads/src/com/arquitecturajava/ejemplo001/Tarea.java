package com.arquitecturajava.ejemplo001;

public class Tarea extends Thread {

	
	
	public Tarea(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
	
		for(int i=0;i<5;i++) {
			
			try {
				System.out.println("hola tarea :"+ this.getName()+ " iteracion :"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
