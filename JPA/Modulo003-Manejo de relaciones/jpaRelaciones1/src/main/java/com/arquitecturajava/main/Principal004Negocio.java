package com.arquitecturajava.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.arquitecturajava.dominio.Libro;

public class Principal004Negocio {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		Libro l1= em.find(Libro.class, "1AB");
		Libro l2= em.find(Libro.class, "6FG");

		System.out.println(l1.esMasNuevo(l2));
	}

}
