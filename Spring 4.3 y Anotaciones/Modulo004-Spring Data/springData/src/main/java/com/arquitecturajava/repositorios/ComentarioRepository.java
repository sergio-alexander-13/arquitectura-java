package com.arquitecturajava.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arquitecturajava.bo.Comentario;

@Repository
public interface ComentarioRepository  extends JpaRepository<Comentario,Integer>{

	
	
	
}
