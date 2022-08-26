package com.arquitecturajava.repositorios;

import com.arquitecturajava.bo.Comentario;

public interface GenericRepository<T,K> {

	public T findOne(K k);
	public Iterable<T> findAll();
	public void save(T tipo);
	public void delete (T tipo);
	
	
}
