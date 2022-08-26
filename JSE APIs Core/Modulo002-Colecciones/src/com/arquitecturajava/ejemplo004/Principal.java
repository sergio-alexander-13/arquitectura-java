package com.arquitecturajava.ejemplo004;

public class Principal {

	public static void main(String[] args) {
		
		Libro libro1= new Libro("java","cecilio");
		
		libro1.addCapitulo(new Capitulo("introduccion",25));
		libro1.addCapitulo(new Capitulo("tipos basicos",20));
		
		
		System.out.println(libro1.totalCapitulos());
		
		System.out.println(libro1.totalPaginas());
		//devuelve false
		System.out.println(libro1.contieneCapitulo(new Capitulo("introduccion",25)));
		
		
		for (Capitulo c:libro1.getListaCapitulos()) {
			
			System.out.println(c.getTitulo());
		}
		
		libro1.cambiarCapitulo(new Capitulo("introduccion",25), new Capitulo("introduccion2",15));
		
		for (Capitulo c:libro1.getListaCapitulos()) {
			
			System.out.println(c.getTitulo());
		}
		
		
		

	}

}
