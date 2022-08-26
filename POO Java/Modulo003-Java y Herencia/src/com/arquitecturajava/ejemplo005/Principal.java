package com.arquitecturajava.ejemplo005;

public class Principal {

	public static void main(String[] args) {

		// polimorfismo
		Persona p1= new Deportista("pedro");
		//y esto que utilidad tiene
		//p1.andar();
		Persona p2= new Ingeniero("ana");
		//y esto que utilidad tiene
		//p2.andar();
	
		Deportista d1= new Deportista("angel");
		
		iniciarCaminoPersona(d1);
		iniciarCaminoPersona(p1);
		iniciarCaminoPersona(p2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// oculta una jerarquia de clases completa 
	// es decir el programador que usa este metodo 
	// no necesita saber que existen el ingeniero y el deportista
	
	public static void iniciarCaminoPersona(Persona p) {
		
		p.andar();
	}
	


}
