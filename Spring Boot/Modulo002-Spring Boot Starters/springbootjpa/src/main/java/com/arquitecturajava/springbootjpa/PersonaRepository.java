package com.arquitecturajava.springbootjpa;

import org.springframework.data.repository.CrudRepository;


public interface PersonaRepository extends CrudRepository<Persona,String> {

	
}
