package com.arquitecturajava.ejemplo006;

import com.arquitecturajava.ejemplo007.Coche;

public class Principal {

	public static void main(String[] args) {
		
		// constructor por defecto
		Coche c= new Coche();
//		c.setMarca("citroen");
//		c.setModelo("c3");
		
		System.out.println(c.getMarca());
		System.out.println(c.getModelo());

		

	}

}
