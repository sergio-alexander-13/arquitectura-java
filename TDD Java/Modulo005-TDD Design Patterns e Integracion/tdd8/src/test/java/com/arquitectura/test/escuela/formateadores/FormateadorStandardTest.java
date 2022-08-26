package com.arquitectura.test.escuela.formateadores;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.Matchers.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.arquitecturajava.escuela.Alumno;
import com.arquitecturajava.escuela.Clase;
import com.arquitecturajava.escuela.Nota;
import com.arquitecturajava.escuela.ficheros.Lector;
import com.arquitecturajava.escuela.ficheros.Transformador;
import com.arquitecturajava.escuela.ficheros.formateadores.Formateador;
import com.arquitecturajava.escuela.ficheros.formateadores.FormateadorStandard;

@ExtendWith(MockitoExtension.class)
class FormateadorStandardTest {


	@Test
	void testObtenerClaseConAlumnosStandard() throws FileNotFoundException {
		
		
		List<String> lineasFixture=new ArrayList<String>();
		lineasFixture.add("*****************");
		lineasFixture.add("antonio,matematicas,7.5");
		lineasFixture.add("antonio,lengua,8");
		lineasFixture.add("-----------------");
		lineasFixture.add("gema,matematicas,5");
		lineasFixture.add("gema,lengua,9");
		lineasFixture.add("*****************");
		
	
		Formateador formateador= new FormateadorStandard();
		Clase miclase= formateador.getClase(lineasFixture);
		
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
