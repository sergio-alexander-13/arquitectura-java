package com.arquitecturajava.ejemplo004;

public class Principal {

	public static void main(String[] args) {
		
		Coche c= new Coche("toyota","yaris");
		
		
		System.out.println(c.getMarca());
		System.out.println(c.getModelo());
		
		//sobrecarga
		Coche c1= new Coche("yaris");
		
		
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());

	}

}
