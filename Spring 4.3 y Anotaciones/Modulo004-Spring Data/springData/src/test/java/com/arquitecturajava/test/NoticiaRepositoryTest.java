package com.arquitecturajava.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.repositorios.NoticiaRepository;
import com.arquitecturajava.test.config.ConfiguracionSpringTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConfiguracionSpringTest.class)
public class NoticiaRepositoryTest extends JPAUnitTest {

	@Autowired
	NoticiaRepository repositorio;
	
	
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
	
	@Test
	public void borrarNoticia() {
		
		em.getTransaction().begin();
		//noticia y esta noticia no la buscamos primero 
		//no esta dentro del entity manager
		Noticia noticiaBorrar= new Noticia("java 9 ha salido");
		repositorio.delete(noticiaBorrar);
		em.getTransaction().commit();
		Noticia noticia= repositorio.findOne("java 9 ha salido");
		assertNull(noticia);
		
	
		
	}
}
