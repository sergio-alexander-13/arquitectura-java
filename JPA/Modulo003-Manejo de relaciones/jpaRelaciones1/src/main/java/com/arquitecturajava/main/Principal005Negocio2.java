package com.arquitecturajava.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.arquitecturajava.dominio.Categoria;
import com.arquitecturajava.dominio.Libro;

public class Principal005Negocio2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Categoria c=em.find(Categoria.class, "programacion");
		List<Libro> lista=c.getLibros();
		for (Libro l:lista) {
			l.setCategoria(null);
		}
		em.remove(c);
		em.getTransaction().commit();
	}

}
