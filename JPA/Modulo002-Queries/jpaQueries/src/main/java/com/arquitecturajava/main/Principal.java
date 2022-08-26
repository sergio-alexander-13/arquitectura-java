package com.arquitecturajava.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.arquitecturajava.dominio.Libro;

public class Principal {

	public static void main(String[] args) {
		
		// unidad de persistencia
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em= emf.createEntityManager();
	
		// diseño una primera consulta orientada a objeto
		TypedQuery<Libro> consulta=em.createQuery("select l from Libro l", Libro.class);
		
		List<Libro> lista=consulta.getResultList();
		
		for (Libro unLibro:lista) {
			
			System.out.println(unLibro);
		}

	}

}
