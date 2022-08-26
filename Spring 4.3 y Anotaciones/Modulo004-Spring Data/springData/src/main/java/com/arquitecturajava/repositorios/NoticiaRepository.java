package com.arquitecturajava.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arquitecturajava.bo.Noticia;

@Repository
public interface NoticiaRepository  extends JpaRepository<Noticia,String> {

	
	public Iterable<Noticia> findAllByOrderByTitulo();
	public Iterable<Noticia> findAllByOrderByAutor();
	public Iterable<Noticia> findByTituloLike(String titulo);
}
