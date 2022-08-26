package com.arquitectura.test.escuela;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Nota;

class AlumnoTest {
	
	List<Nota> notas;

	@BeforeEach
	public void setUp() {
		
		Nota nota1 = new Nota(5, "matematicas");
		Nota nota2 = new Nota(7, "lengua");
		Nota nota3 = new Nota(10, "fisica");
		
		// dos suspensos
		Nota nota4 = new Nota(4, "lengua");
		Nota nota5 = new Nota(3, "ingles");
		Nota nota6 = new Nota(1, "fisica");
		Nota nota7 = new Nota(0, "informatica");
	
		
		notas = new ArrayList<Nota>();
		notas.add(nota1);
		notas.add(nota2);
		notas.add(nota3);
		notas.add(nota4);
		notas.add(nota5);
		notas.add(nota6);	
		notas.add(nota7);	
	}

	@Test
	void testAñadirNotaAlumno() {
		//mas solida
		Alumno alumno1 = new Alumno("juan", notas);
		alumno1.addNota(new Nota(4, "ingles"));
		assertThat(alumno1.getNotas(),hasItem(new Nota(4,"ingles")));
	}

	@Test
	void testBorrarNotaAlumno() {

		
		Alumno alumno1 = new Alumno("juan", notas);
		alumno1.removeNota(new Nota(5, "matematicas"));
		assertThat(alumno1.getNotas(),not (hasItem(new Nota(5,"matematicas"))));

	}
	
	@Test
	void testMejorNotaAlumno() {

		
		Alumno alumno1 = new Alumno("juan", notas);
		assertThat(alumno1.getMejorNota(),equalTo(new Nota(10,"fisica")));

	}
	
	@Test
	void testPeorNotaAlumno() {

		
		Alumno alumno1 = new Alumno("juan", notas);
		assertThat(alumno1.getPeorNota(),equalTo(new Nota(0,"informatica")));

	}
	
	@Test
	void testIgualdadEntreAlumnos() {

		
		Alumno alumno1 = new Alumno("juan");
		Alumno alumno2= new Alumno("juan");
		assertThat(alumno1,equalTo(alumno2));

	}
	
	@AfterEach
	void tearDown() {
		// cerrar recursos en cada ejecución de un test
		notas=null;
	}

}
