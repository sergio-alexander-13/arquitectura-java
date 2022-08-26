package com.arquitectura.test.escuela;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Clase;

@ExtendWith(MockitoExtension.class)
class ClaseTest2 {

	// los objetos mock por inyeccion de dependencias
	// utilizando las anotaciones el que arrancara
	// y configurara los mocks
	@Mock Alumno alumno1,alumno2;
	
	@Test
	void testMediaDeLaClase() {
		
			
			Mockito.when(alumno1.getNotaMedia()).thenReturn(6.2);
			Mockito.when(alumno2.getNotaMedia()).thenReturn(7.1);
			
			
			List<Alumno> alumnos= new ArrayList<Alumno>();
			alumnos.add(alumno1);
			alumnos.add(alumno2);
			// media total es 4.5
			Clase c= new Clase ("1A",alumnos);
			
			assertThat(c.getMedia(),closeTo(6.6,0.2));
			
			
			
			
		
		
	}
	
	

	
}
