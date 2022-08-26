package com.arquitectura.test.escuela.ficheros;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Clase;
import com.arquitecturajava.escuela.Nota;
import com.arquitecturajava.escuela.ficheros.Lector;
import com.arquitecturajava.escuela.ficheros.Transformador;
import com.arquitecturajava.escuela.ficheros.formateadores.Formateador;
import com.arquitecturajava.escuela.ficheros.formateadores.FormateadorA;
import com.arquitecturajava.escuela.ficheros.formateadores.FormateadorB;
import com.arquitecturajava.escuela.ficheros.formateadores.FormateadorStandard;

@ExtendWith(MockitoExtension.class)
class TransformadorTest {

	@Mock
	Lector lector;
	@Spy
	FormateadorStandard formateador;

	@Test
	void testObtenerClaseConAlumnos() throws FileNotFoundException {

		List<String> lineasFixture = new ArrayList<String>();
		lineasFixture.add("*****************");
		lineasFixture.add("antonio,matematicas,7.5");
		lineasFixture.add("antonio,lengua,8");
		lineasFixture.add("-----------------");
		lineasFixture.add("gema,matematicas,5");
		lineasFixture.add("gema,lengua,9");
		lineasFixture.add("*****************");

		// genero un mock esto ya lo tenia
		// y le configuro para que me devuelva una lista de strings
		Mockito.when(lector.leer()).thenReturn(lineasFixture);

		// genero un spy y confirmo que el transformador llama al lector
		// y al formateador

		Transformador transformador = new Transformador(lector, formateador);

		Clase miclase = transformador.getClase();

		Mockito.verify(formateador, Mockito.times(1)).getClase(lineasFixture);
		Mockito.verify(lector, Mockito.times(1)).leer();

	}

}
