package com.arquitecturajava.test.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.arquitecturajava.bo.Comentario;
import com.arquitecturajava.repositorios.ComentarioRepository;
import com.arquitecturajava.test.config.ConfiguracionSpringTest;
import com.arquitecturajava.test.jpa.JPAUnitTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConfiguracionSpringTest.class)
public class ComentarioRepositoryTest extends JPAUnitTest {

	@Autowired
	ComentarioRepository repositorio;
	
	
	@Test
	public void seleccionarTodosLosComentarios() {
		
		Comentario comentario=repositorio.findAll().iterator().next();
		assertEquals("pedro",comentario.getAutor());
	}
	@Test
	public void seleccionarUnComentario() {
		
		Comentario comentario=repositorio.findOne(1);
		assertEquals("bien!!!",comentario.getTexto());
		
		
	}
	
}
