package com.arquitecturajava.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.repositorios.jpa.NoticiaRepositoryJPA;

public class NoticiaRepositoryTest extends JPAUnitTest {

	
	NoticiaRepositoryJPA repositorio;
	
	@Before
	public void setup() {
		super.setup();
		repositorio= new NoticiaRepositoryJPA();
		repositorio.setEntityManager(em);
	}
	
	@Test
	public void inyectarEntityManager() {
		
		assertEquals(em,repositorio.getEntityManager());
		
	}
	@Test
	public void seleccionarTodasLasNoticias() {
		
		Noticia noticia=repositorio.findAll().iterator().next();
		assertEquals("java 9 ha salido",noticia.getTitulo());
	}
	@Test
	public void insertarNoticia() {
		
		em.getTransaction().begin();
		Noticia noticiaNueva= new Noticia("java 8 streams","Cecilio", new Date());
		repositorio.save(noticiaNueva);
		em.getTransaction().commit();
		Noticia noticia= repositorio.findOne("java 8 streams");
		assertEquals(noticiaNueva,noticia);
		
	}
}
