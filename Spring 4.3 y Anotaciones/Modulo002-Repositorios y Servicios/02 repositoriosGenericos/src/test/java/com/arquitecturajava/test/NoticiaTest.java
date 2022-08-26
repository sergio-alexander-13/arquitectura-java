package com.arquitecturajava.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import com.arquitecturajava.bo.Noticia;

public class NoticiaTest extends JPAUnitTest {

	
	
	
	@Test
	public void entityManagerFactoryOK() {
		
		assertNotNull(emf);
	}
	
	@Test
	public void entityManagerOK() {
		
		assertNotNull(em);
	}
	
	@Test
	public void seleccionarNoticiaInicial() {
		
		Noticia noticia= em.find(Noticia.class, "java 9 ha salido");
		assertEquals("cecilio",noticia.getAutor());
		
	}
	
	@Test
	public void borrarNoticiaInicial() {
		
		Noticia noticia= em.find(Noticia.class, "java 9 ha salido");
		em.getTransaction().begin();
		em.remove(noticia);
		em.getTransaction().commit();
		Noticia sinNoticia= em.find(Noticia.class, "java 9 ha salido");
		assertNull(sinNoticia);
		
	}
	@Test
	public void insertarNuevaNoticia() {
		
		em.getTransaction().begin();
		Noticia noticiaNueva= new Noticia("java 8 y streams","Cecilio",new Date());
		em.persist(noticiaNueva);
		em.getTransaction().commit();
		Noticia noticiaInsertada= em.find(Noticia.class,"java 8 y streams");
		
		
	}
	
	
		
}
