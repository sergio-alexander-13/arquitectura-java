package com.arquitecturajava.repositorios.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.arquitecturajava.repositorios.GenericRepository;
@Repository
public abstract class GenericRepositoryJPA<T,K> implements GenericRepository<T, K> {

	@PersistenceContext
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
		//a�ade el select
		consulta.select(raiz);
		
		TypedQuery<T> miconsulta= entityManager.createQuery(consulta);
		return miconsulta.getResultList();
		
	}
	@Transactional
	public void save(T tipo) {
		
		entityManager.persist(tipo);
		
	}
	@Transactional
	public void delete(T tipo) {
		
		entityManager.remove(entityManager.merge(tipo));
		
	}

}
