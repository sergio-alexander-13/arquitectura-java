package com.arquitecturajava.ejemplo006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		Libro l1 = new Libro("El juego de ender", 400, "ciencia ficcion", 20);
		Libro l2 = new Libro("Harry Potter y el caliz de fuego", 600, "fantasia", 25);
		Libro l3 = new Libro("Las hijas del frio", 300, "novela negra", 15);
		Libro l4 = new Libro("Los pilares de la tierra", 1000, "historica", 30);

		List<Libro> milista = Arrays.asList(l1, l2, l3, l4);

		List<Libro> listaFiltro = new ArrayList<Libro>();

		
		Predicate<Libro> miFiltro=  (Libro l)->l.getPaginas()>400;
		Predicate<Libro>otroFiltro=miFiltro.and((Libro l)->l.getPaginas()<800).or((Libro l)->l.getCategoria().equals("historica"));
		
		Predicate<Libro> nuevoFiltro=miFiltro.or((Libro l)->l.getCategoria().equals("fantasia"));
		//codigo repetido
		filtro(milista, listaFiltro,otroFiltro);
		
		mostrarLibros(listaFiltro);
		
	
	}

	// mas general y mas flexible apoyandonos en los interfaces
	// tiene menos codigo repetido

	// interface predefinido por java
	private static void filtro(List<Libro> milista, List<Libro> listaFiltro, Predicate<Libro> f) {
		// mas general
		for (Libro l : milista) {

			if (f.test(l)) {

				listaFiltro.add(l);
			}
		}
	}

	private static void mostrarLibros(List<Libro> milista) {
		for (Libro l : milista) {

			System.out.println(l.getTitulo());
		}
	}

}
