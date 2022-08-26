package com.arquitecturajava.ejemplo2;

import java.util.List;
import java.util.OptionalInt;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal {

	public static void main(String[] args) {

		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lista = servicio.buscarTodos();

//		int total=lista.stream().map(Persona::getEdad).reduce(0, (a,b)->a+b);
//		int max=lista.stream().map(Persona::getEdad).reduce(0, (a,b)->a>b?a:b);
//		int min=lista.stream().map(Persona::getEdad).reduce(120, (a,b)->a>b?b:a);

		int suma = lista.stream().mapToInt(Persona::getEdad).sum();
		int elemento = (int) lista.stream().mapToInt(Persona::getEdad).count();
		
		System.out.println(elemento);
		
		OptionalInt minimo = lista.stream().mapToInt(Persona::getEdad).min();

		if (minimo.isPresent())
			System.out.println(minimo.getAsInt());

		OptionalInt maximo = lista.stream().mapToInt(Persona::getEdad).max();

		if (maximo.isPresent())
			System.out.println(maximo.getAsInt());

	}

}
