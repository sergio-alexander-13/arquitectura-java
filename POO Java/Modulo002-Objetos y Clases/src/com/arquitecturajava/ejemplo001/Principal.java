package com.arquitecturajava.ejemplo001;

public class Principal {

	public static void main(String[] args) {
	
		// construye un objeto
		Rectangulo r1= new Rectangulo();
		r1.lado1=5;
		r1.lado2=2;
		Rectangulo r2= new Rectangulo();
		r2.lado1=2;
		r2.lado2=2;
		
		System.out.println(r1.lado1);
		System.out.println(r1.lado2);
		
		System.out.println(r2.lado1);
		System.out.println(r2.lado2);
		
		System.out.println(r1.area());
		System.out.println(r1.perimetro());
		

	}

}
