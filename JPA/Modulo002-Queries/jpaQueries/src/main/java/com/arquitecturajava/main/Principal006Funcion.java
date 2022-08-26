package com.arquitecturajava.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.arquitecturajava.dominio.Libro;

public class Principal006Funcion {

	public static void main(String[] args) {
		
		// unidad de persistencia
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em= emf.createEntityManager();
	
		// diseño una primera consulta orientada a objeto con where
		TypedQuery<String> consulta=em.createQuery("select distinct upper(l.autor) from Libro l", String.class);
		
		List<String> lista=consulta.getResultList();
		
		for (String autor:lista) {
			
			System.out.println(autor);
		}

	}

}
