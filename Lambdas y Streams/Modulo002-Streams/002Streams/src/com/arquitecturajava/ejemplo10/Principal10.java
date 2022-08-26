package com.arquitecturajava.ejemplo10;

import java.util.Optional;

import com.arquitecturajava.dominio.Persona;

public class Principal10 {

	public static void main(String[] args) {

		
//		Persona p1=new Persona ("juan","sanchez",20);
//		//Persona p1=null;
//		if(p1!=null) {
//			System.out.println(p1.getNombre());
//		}
		
		//Optional<Persona> op1=Optional.empty();
		Optional<Persona> op1= Optional.of(new Persona("juan","sanchez",20));
		if (op1.isPresent()) {
			
			System.out.println(op1.get().getNombre());
		}
	
		

	}

}
