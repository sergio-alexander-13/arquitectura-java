package com.arquitecturajava.ejemplo10;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal {

	public static void main(String[] args) {

		IntStream mistream = IntStream.range(1, 10);

		// mistream.map((n)->n*n).forEach(System.out::println);

		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lista = servicio.buscarTodos();

		int total = lista.stream().map(Persona::getEdad).reduce(0, (a, b) -> a + b);

		// optional generico
		// OptionalInt
		// oTotal=lista.stream().mapToInt(Persona::getEdad).reduce(Integer::sum);

//		if(oTotal.isPresent()) {
//			
//			System.out.println(oTotal.getAsInt());
//		}

		lista.stream().mapToInt(Persona::getEdad).reduce(Integer::sum).ifPresent(System.out::println);

		System.out.println(total);

	}

}
