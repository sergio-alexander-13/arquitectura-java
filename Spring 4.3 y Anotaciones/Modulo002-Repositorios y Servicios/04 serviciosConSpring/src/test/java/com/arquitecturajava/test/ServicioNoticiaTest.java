package com.arquitecturajava.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.config.ConfiguracionSpring;
import com.arquitecturajava.repositorios.jpa.ComentarioRepositoryJPA;
import com.arquitecturajava.repositorios.jpa.NoticiaRepositoryJPA;
import com.arquitecturajava.servicios.jpa.ServicioNoticiasJPA;

import static org.mockito.Mockito.*;

import java.util.Arrays;


public class ServicioNoticiaTest {
	
	NoticiaRepositoryJPA repositorioNoticia;
	ComentarioRepositoryJPA repositorioComentario;
	ServicioNoticiasJPA servicioNoticias;
	
	@Before
	public void setUp() {
		
		//entityManager
		repositorioNoticia= new NoticiaRepositoryJPA();
		repositorioComentario= new ComentarioRepositoryJPA();
		servicioNoticias= new ServicioNoticiasJPA();
	}
	
	@Test
	public void inyectarRepositoriosOK() {
		
		servicioNoticias.setRepositorioNoticias(repositorioNoticia);
		servicioNoticias.setRepositorioComentarios(repositorioComentario);
		assertEquals(repositorioNoticia,servicioNoticias.getRepositorioNoticias());
		assertEquals(repositorioComentario,servicioNoticias.getRepositorioComentarios());
		
	}
	@Test
	public void buscarTodasLasNoticias() {
		//testear el acceso a la base de datos
		//no , simplemente que hemos delegado en el repositorio correctamente 
		
		NoticiaRepositoryJPA miMock= mock(NoticiaRepositoryJPA.class);
		when(miMock.findAll()).thenReturn(Arrays.asList(new Noticia("java 9 ha salido")));
		servicioNoticias.setRepositorioNoticias(miMock);
		Iterable<Noticia> it=servicioNoticias.findAllNoticias();
		Noticia noticia= it.iterator().next();
		assertEquals("java 9 ha salido",noticia.getTitulo());
		
		
	}

}
