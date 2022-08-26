package com.arquitecturajava.test.spring;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.repositorios.ComentarioRepository;
import com.arquitecturajava.repositorios.NoticiaRepository;
import com.arquitecturajava.servicios.ServicioNoticias;
import com.arquitecturajava.test.config.ConfiguracionSpringTest;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConfiguracionSpringTest.class)
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
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
		
		NoticiaRepository miMock= mock(NoticiaRepository.class);
		when(miMock.findAll()).thenReturn(Arrays.asList(new Noticia("java 9 ha salido")));
		servicioNoticias.setRepositorioNoticias(miMock);
		Iterable<Noticia> it=servicioNoticias.findAllNoticias();
		Noticia noticia= it.iterator().next();
		assertEquals("java 9 ha salido",noticia.getTitulo());
		
		
	}

}
