package com.arquitecturajava.springbootrest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("webapi")
public class PersonaRestController {

	@Autowired
	PersonaRepository repositorio;

	@GetMapping("/personas")
	public Iterable<Persona> buscarTodos() {

		return repositorio.findAll();
	}
	@PostMapping(path="/personas", consumes="application/json")
	public void insertar(@RequestBody Persona persona) {

		repositorio.save(persona);
	}
	
	@DeleteMapping("/personas/{nombre}")
	public void borrar(@PathVariable String nombre) {
		
		Optional<Persona> persona=repositorio.findById(nombre);
		
		if (persona.isPresent()) {
			repositorio.delete(persona.get());
			
		}
		
	}

}
