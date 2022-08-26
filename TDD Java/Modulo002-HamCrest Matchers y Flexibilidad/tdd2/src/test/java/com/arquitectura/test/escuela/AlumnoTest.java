package com.arquitectura.test.escuela;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Nota;

class AlumnoTest {

	@Test
	void testAñadirNotaAlumno() {
	
		Nota nota1= new Nota(5,"matematicas");
		Nota nota2= new Nota(7,"lengua");
		
		List<Nota> notas= new ArrayList<Nota>();
		notas.add(nota1);
		notas.add(nota2);
		Alumno alumno1= new Alumno("juan",notas);
		
		alumno1.addNota(new Nota(4,"ingles"));
		
		assertEquals(3, alumno1.getNotas().size());
		
		
		
	}
	
	@Test
	void testBorrarNotaAlumno() {
	
		Nota nota1= new Nota(5,"matematicas");
		Nota nota2= new Nota(7,"lengua");
		
		List<Nota> notas= new ArrayList<Nota>();
		notas.add(nota1);
		notas.add(nota2);
		Alumno alumno1= new Alumno("juan",notas);
		
		// e eliminar una nota que ya existia que es la 
		// de matematicas
		alumno1.removeNota(new Nota(5,"matematicas"));
		
		assertEquals(1, alumno1.getNotas().size());
		
		
		
	}
	

}
