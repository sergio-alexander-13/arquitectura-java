package com.arquitecturajava.repositorios.jpa;

import javax.persistence.EntityManager;

import com.arquitecturajava.bo.Comentario;
import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.repositorios.ComentarioRepository;

public class ComentarioRepositoryJPA implements ComentarioRepository {

	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Comentario findOne(int numero) {
		// TODO Auto-generated method stub
		return  entityManager.find(Comentario.class, numero);
	}

	public Iterable<Comentario> findAll() {
		// TODO Auto-generated method stub
		return  entityManager.createQuery("select c from Comentario c",Comentario.class).getResultList();
	}

	public void save(Comentario comentario) {
		
		entityManager.persist(comentario);

	}

	public void delete(Comentario comentario) {
		entityManager.remove(comentario);

	}

}
