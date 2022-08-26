package com.arquitecturajava.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.arquitecturajava.dominio.Libro;

public class Principal4Actualizar {

	public static void main(String[] args) {
		
		// unidad de persistencia
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em= emf.createEntityManager();
		Libro libro= em.find(Libro.class, "1A");
		
		try {
			em.getTransaction().begin();
			libro.setPrecio(5);
			libro.setAutor("pedro");
			em.merge(libro);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if (em!=null) {
				em.close();
			}
		}
		
		

	}

}
