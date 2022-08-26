package com.arquitectura.test.escuela.integracion;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;

import java.io.File;
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
import com.arquitecturajava.escuela.ficheros.formateadores.FormateadorFactory;
import com.arquitecturajava.escuela.ficheros.formateadores.FormateadorStandard;

@ExtendWith(MockitoExtension.class)
class TransformadorIntegracionTest {

	
	Lector lector;
	
	Formateador formateador;

	@Test
	void testObtenerClaseConAlumnos() throws FileNotFoundException {

		lector= new Lector(new File("src/test/resources/testfixture.txt"));
		// que es el que lee la cabecera de la linea del ficher
		// es una lectura como muy manual
		String cabecera= lector.getCabecera();
		
		formateador= FormateadorFactory.getInstance(cabecera);
		// los objetos reales no hay ningun mock
		Transformador transformador = new Transformador(lector, formateador);

		Clase miclase = transformador.getClase();
		List<Alumno> alumnos=miclase.getAlumnos();
		//avanzamos con los assert el test es cada vez más solido
		assertThat(alumnos.size(), equalTo(2));
		
		assertThat(alumnos,hasItems( new Alumno("antonio")));
		assertThat(alumnos,hasItems( new Alumno("gema")));
		
		assertThat (alumnos.get(0).getNotas().size(),equalTo(2));
		assertThat (alumnos.get(1).getNotas().size(),equalTo(2));
		
		assertThat (alumnos.get(0).getNotas(),hasItem(new Nota(7.5,"matematicas")));
		assertThat (alumnos.get(1).getNotas(),hasItem(new Nota(9,"lengua")));
	
		
		
		
	

	}

}
