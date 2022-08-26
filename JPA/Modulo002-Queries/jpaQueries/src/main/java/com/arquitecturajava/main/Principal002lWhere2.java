package com.arquitecturajava.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.arquitecturajava.dominio.Libro;

public class Principal002lWhere2 {

	public static void main(String[] args) {
		
		// unidad de persistencia
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em= emf.createEntityManager();
	
		// diseño una primera consulta orientada a objeto con where
		TypedQuery<Libro> consulta=em.createQuery("select l from Libro l where l.precio=:precio and autor=:autor", Libro.class);
		consulta.setParameter("precio", 3);
		consulta.setParameter("autor", "cecilio");
		List<Libro> lista=consulta.getResultList();
		
		for (Libro unLibro:lista) {
			
			System.out.println(unLibro);
		}

	}

}
