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

class AlumnoTestEstadisticas {
	
	
	

	@Test
	void testNumeroDeSobreSalientes() {

		Nota nota1 = new Nota(5, "matematicas");
		Nota nota2 = new Nota(7, "lengua");
		Nota nota3 = new Nota(10, "fisica");
	
		
		List<Nota> notas = new ArrayList<Nota>();
		notas.add(nota1);
		notas.add(nota2);
		notas.add(nota3);
		
		
		Alumno alumno1 = new Alumno("juan", notas);
		assertThat(1,equalTo(alumno1.getSobreSalientes()));
	}
	
	@Test
	void testNumeroSuspensos() {

		Nota nota1 = new Nota(2, "matematicas");
		Nota nota2 = new Nota(6, "lengua");
		Nota nota3 = new Nota(1, "fisica");
	
		
		List<Nota> notas = new ArrayList<Nota>();
		notas.add(nota1);
		notas.add(nota2);
		notas.add(nota3);
		
		Alumno alumno1 = new Alumno("juan", notas);
		assertThat(2,equalTo(alumno1.getSuspensos()));
	}
	
	@Test
	void testNumeroMuyDeficientes() {

		Nota nota1 = new Nota(4, "matematicas");
		Nota nota2 = new Nota(6, "lengua");
		Nota nota3 = new Nota(1, "fisica");
	
		
		List<Nota> notas = new ArrayList<Nota>();
		notas.add(nota1);
		notas.add(nota2);
		notas.add(nota3);
		
		Alumno alumno1 = new Alumno("juan", notas);
		assertThat(1,equalTo(alumno1.getMuyDeficientes()));
	}
	
	@Test
	void testNotaMediaAlumno() {

		Nota nota1 = new Nota(2, "matematicas");
		Nota nota2 = new Nota(5, "lengua");
		Nota nota3 = new Nota(7, "fisica");
	
		
		List<Nota> notas = new ArrayList<Nota>();
		notas.add(nota1);
		notas.add(nota2);
		notas.add(nota3);
		
		Alumno alumno1 = new Alumno("juan", notas);
		assertThat(4.66,closeTo(alumno1.getNotaMedia(),0.2));
	}
	
	
	

}
