package com.arquitecturajava.repositorios;

import com.arquitecturajava.bo.Comentario;

public interface ComentarioRepository {

	public Comentario findOne(int numero);
	public Iterable<Comentario> findAll();
	public void save(Comentario comentario);
	public void delete (Comentario comentario);
	
	
}
