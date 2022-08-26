package com.arquitectura.test.escuela;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.escuela.Nota;

class NotaTest {

	@Test
	void testMismaAsignaturaNota() {

		// arrange

		Nota nota1 = new Nota(8, "lengua");
		Nota nota2 = new Nota(7, "lengua");
		Nota nota3 = new Nota(8, "matematicas");
		boolean esMisma = nota1.esMismaAsignatura(nota2);
		boolean esDistinta = nota1.esMismaAsignatura(nota3);

		assertTrue(esMisma);
		assertFalse(esDistinta);

	}

	@Test
	void testIgualdadNotas() {

		// arrange

		Nota nota1 = new Nota(8, "lengua");
		Nota nota2 = new Nota(8, "lengua");
		Nota nota3 = new Nota(8, "matematicas");

		// Act o ejecutar
		boolean iguales = nota1.equals(nota2);

		

	}

	@Test
	void testNoIgualdadNotas() {

		// arrange

		Nota nota1 = new Nota(8, "lengua");

		Nota nota3 = new Nota(8, "matematicas");

		boolean noIguales = nota1.equals(nota3);

		// assert
		assertFalse(noIguales);

	}

	@Test
	void testNotaEsMayorQueOtra() {

		// arrange

		Nota nota1 = new Nota(5, "lengua");

		Nota nota3 = new Nota(8, "lengua");

		boolean esMayor= nota3.esMayor(nota1);
		
		assertTrue(esMayor);


	}
	
	@Test
	void testNotaNoesComparableConOtra() {

		// arrange

		Nota nota1 = new Nota(5, "lengua");

		Nota nota3 = new Nota(8, "matematicas");
		
		// se que las notas no van a ser comparables
		//acabamos de ver como se gestiona un lanzamiento de excepciones
		// con asserts y como se testean
		
		assertThrows(RuntimeException.class, ()->nota1.esMayor(nota3));


	}

}
