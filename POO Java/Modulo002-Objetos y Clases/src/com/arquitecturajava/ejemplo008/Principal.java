package com.arquitecturajava.ejemplo008;

public class Principal {

	public static void main(String[] args) {
		
		
		//Circulo c= new Circulo(2);
		System.out.println(Circulo.area(2));
		
		// esto es problematico ????
		Circulo c= new Circulo(2);
		System.out.println(c.area());

	}

}
