package com.arquitecturajava.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.config.ConfiguracionSpring;
import com.arquitecturajava.repositorios.ComentarioRepository;
import com.arquitecturajava.repositorios.NoticiaRepository;
import com.arquitecturajava.repositorios.jpa.NoticiaRepositoryJPA;
import com.arquitecturajava.servicios.ServicioNoticias;
import com.arquitecturajava.test.config.ConfiguracionSpringTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConfiguracionSpringTest.class)
public class ServicioNoticiaTestSpring {
	
	@Autowired
	NoticiaRepository repositorioNoticia;
	@Autowired
	ComentarioRepository repositorioComentario;
	@Autowired
	ServicioNoticias servicioNoticias;
	
	
	@Test
	public void inyectarRepositoriosOK() {
			
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
