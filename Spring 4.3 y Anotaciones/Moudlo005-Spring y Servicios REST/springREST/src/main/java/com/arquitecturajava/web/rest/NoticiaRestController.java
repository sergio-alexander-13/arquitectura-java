package com.arquitecturajava.web.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.repositorios.NoticiaRepository;

@RestController
@RequestMapping("/webapi")
public class NoticiaRestController {

	@Autowired
	NoticiaRepository mirepositorio;
	
	@GetMapping(value="/noticias",produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Noticia> findAllNoticias() {
		
		return mirepositorio.findAll();
	}
	
	@GetMapping(value="/noticias/{titulo}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Noticia findOne(@PathVariable String titulo) {
		
		return mirepositorio.findOne(titulo);
	}
	@PostMapping(value="/noticias",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void save( @RequestBody Noticia noticia) {
		
		 mirepositorio.save(noticia);
			 
	}
	
	
	@PutMapping(value="/noticias/{titulo}",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void update( @RequestBody Noticia noticia, @PathVariable String titulo) {
		
		Noticia noticiaOriginal=mirepositorio.findOne(titulo);
		//informacion que viene de la peticion put
		noticiaOriginal.setAutor(noticia.getAutor());
		noticiaOriginal.setFecha(noticia.getFecha());
		
		
		
		 mirepositorio.save(noticiaOriginal);
			 
	}
	
	@DeleteMapping(value="/noticias/{titulo}",produces=MediaType.APPLICATION_JSON_VALUE)
	public void delete( @PathVariable String titulo) {
		
		 mirepositorio.delete(new Noticia(titulo));
			 
	}
	
	
}

