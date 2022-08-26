package com.arquitecturajava.ejemplo005;

// que implementa dos interfaces
public class SuperBrazo implements Girable, Rotable {

	@Override
	public void rotar() {
		
		System.out.println("el super brazo gira");
		
	}

	@Override
	public void girar() {
		System.out.println("el super brazo rota");
		
	}

}
