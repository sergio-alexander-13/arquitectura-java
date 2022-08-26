package com.arquitecturajava.repositorios.jpa;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.arquitecturajava.repositorios.GenericRepository;

public class GenericRepositoryJPA<T,K> implements GenericRepository<T, K> {

	
	private EntityManager entityManager;
	private Class<T> type;

	public GenericRepositoryJPA(Class<T> type) {
		
		this.type=type;
	}
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public T findOne(K k) {
		// TODO Auto-generated method stub
		return entityManager.find(type, k);
	}

	public Iterable<T> findAll() {
		
		CriteriaBuilder cb= this.entityManager.getCriteriaBuilder();
		//generico
		CriteriaQuery<T> consulta=cb.createQuery(type);
		// generico
		Root<T> raiz= consulta.from(type);
		//añade el select
		consulta.select(raiz);
		
		TypedQuery<T> miconsulta= entityManager.createQuery(consulta);
		return miconsulta.getResultList();
		
		
	}

	public void save(T tipo) {
		
		entityManager.persist(tipo);
		
	}

	public void delete(T tipo) {
		entityManager.remove(tipo);
		
	}

}
