package com.arquitectura.test.escuela;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Clase;
import com.arquitecturajava.escuela.Nota;

class ClaseTest {


	@Test
	void testAñadirAlumnoALaClase() {
	
		Alumno alumno1= new Alumno("juan");
		List<Alumno> alumnos= new ArrayList<Alumno>();
		alumnos.add(alumno1);
		Clase clase= new Clase("1A",alumnos);
		
		
		clase.addAlumno(new Alumno("ana"));
		
		
		assertThat(clase.getAlumnos(),hasItem(new Alumno("ana")));
		
		
		
	}
	
	
	@Test
	void testRemoveAlumnoALaClase() {
	
		Alumno alumno1= new Alumno("juan");
		List<Alumno> alumnos= new ArrayList<Alumno>();
		alumnos.add(alumno1);
		Clase clase= new Clase("1A",alumnos);
		
		
		clase.removeAlumno(new Alumno("juan"));
		
		
		assertThat(clase.getAlumnos(),not (hasItem(new Alumno("juan"))));
		
		
		
	}
	@Test
	void testMediaDeLaClase() {
		
			
			// mock 
			// tengo un test double es decir un objeto 
		// duplicado que en este caso va a ser un stub
		// unicamente implemento una pequeña parte de su funcionalidad
		
			Alumno alumno1= Mockito.mock(Alumno.class);
			Mockito.when(alumno1.getNotaMedia()).thenReturn(6.2);
			
			Alumno alumno2= Mockito.mock(Alumno.class);
			Mockito.when(alumno2.getNotaMedia()).thenReturn(7.1);
			
			
			List<Alumno> alumnos= new ArrayList<Alumno>();
			alumnos.add(alumno1);
			alumnos.add(alumno2);
			// media total es 4.5
			Clase c= new Clase ("1A",alumnos);
			
			assertThat(c.getMedia(),closeTo(6.6,0.2));
			
			
			
			
		
		
	}
	
	
	@Test
	void testMejorNota() {
		
		
			//stubs
			Alumno alumno1= Mockito.mock(Alumno.class);
			Mockito.when(alumno1.getMejorNota()).thenReturn(new Nota(8,"lengua"));
			
			Alumno alumno2= Mockito.mock(Alumno.class);
			Mockito.when(alumno2.getMejorNota()).thenReturn(new Nota(10,"matematicas"));
			
			
			
			List<Alumno> alumnos= new ArrayList<Alumno>();
			alumnos.add(alumno1);
			alumnos.add(alumno2);
			Clase c= new Clase ("1A",alumnos);
			// que el estado de nuestras clases es el correcto
			//no validamos que el comportamiento lo es
			// parece algo absurdo 
			assertThat(c.getMejorNota(),equalTo(new Nota(10,"matematicas")));
			
			// tengo un mock que es un spy y un stub
			// verificame que cada vez que yo invoco a clase.getMejorNota()
			// se han invovado los métodos getMejorNota de cada alumno
			
			// oye la relacion esta correctamnete construida
			// porque cada vez que yo invoco a el metodo getMejorNota
			// deberiamos invocar al de cada alumno una sola vez
			Mockito.verify(alumno1,Mockito.times(1)).getMejorNota();
			Mockito.verify(alumno2,Mockito.times(1)).getMejorNota();
			
		
	}
	
	
}
