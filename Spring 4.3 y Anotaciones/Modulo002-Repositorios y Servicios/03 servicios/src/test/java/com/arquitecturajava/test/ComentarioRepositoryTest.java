package com.arquitecturajava.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.arquitecturajava.bo.Comentario;
import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.repositorios.jpa.ComentarioRepositoryJPA;
import com.arquitecturajava.repositorios.jpa.NoticiaRepositoryJPA;

public class ComentarioRepositoryTest extends JPAUnitTest {

	
	ComentarioRepositoryJPA repositorio;
	
	@Before
	public void setup() {
		super.setup();
		repositorio= new ComentarioRepositoryJPA();
		repositorio.setEntityManager(em);
	}
	
	@Test
	public void inyectarEntityManager() {
		
		assertEquals(em,repositorio.getEntityManager());
		
	}
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
