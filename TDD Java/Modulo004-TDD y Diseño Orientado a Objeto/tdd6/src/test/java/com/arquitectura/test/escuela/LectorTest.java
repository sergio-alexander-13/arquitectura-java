package com.arquitectura.test.escuela;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.escuela.ficheros.Lector;

class LectorTest {

	@Test
	void testLeerLineasDeFicheroStandard() throws FileNotFoundException {
		
		Lector lector =new Lector(new File("src/test/resources/testfixture.txt"));
		List<String> lineas= lector.leer();
		assertThat(7, equalTo(lineas.size()));
		
	}
	
	@Test
	void testLeerLineasDeFicheroTipoA() throws FileNotFoundException {
		
		Lector lector =new Lector(new File("src/test/resources/testfixtureA.txt"));
		List<String> lineas= lector.leer();
		assertThat(7, equalTo(lineas.size()));
		
	}

}
