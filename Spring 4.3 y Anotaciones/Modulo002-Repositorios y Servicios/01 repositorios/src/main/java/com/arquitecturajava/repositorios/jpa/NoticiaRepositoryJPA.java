package com.arquitecturajava.repositorios.jpa;

import javax.persistence.EntityManager;

import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.repositorios.NoticiaRepository;

public class NoticiaRepositoryJPA implements NoticiaRepository {

	
	private EntityManager entityManager;
	
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Noticia findOne(String titulo) {
		// TODO Auto-generated method stub
		return  entityManager.find(Noticia.class, titulo);
	}

	public Iterable<Noticia> findAll() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("select n from Noticia n",Noticia.class).getResultList();
	}

	public void save(Noticia noticia) {
		
		entityManager.persist(noticia);

	}

	public void delete(Noticia noticia) {
		
		entityManager.remove(noticia);
	}

}
