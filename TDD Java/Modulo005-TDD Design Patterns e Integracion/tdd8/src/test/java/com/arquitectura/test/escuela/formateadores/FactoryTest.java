package com.arquitectura.test.escuela.formateadores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.escuela.ficheros.formateadores.Formateador;
import com.arquitecturajava.escuela.ficheros.formateadores.FormateadorFactory;
import com.arquitecturajava.escuela.ficheros.formateadores.FormateadorStandard;

class FactoryTest {

	@Test
	void test() {
		
		Formateador formateador= FormateadorFactory.getInstance("*********");
		assertTrue (formateador instanceof FormateadorStandard);
		
	}

}
