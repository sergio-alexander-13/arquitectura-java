package com.arquitecturajava.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.arquitecturajava.dominio.Categoria;
import com.arquitecturajava.dominio.Libro;

public class Principal002PersistirRelacion {

	public static void main(String[] args) {
		
		// unidad de persistencia
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em= emf.createEntityManager();
		String textoFecha= "20/01/2020";
		SimpleDateFormat ffecha= new SimpleDateFormat("d/M/yyyy");
		Date fecha=null;
		try {
			fecha= ffecha.parse(textoFecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		em.getTransaction().begin();
		Libro libro= new Libro("3ABC","Spring Framework","angel",fecha,4);
		Categoria categoria= em.find(Categoria.class, "programacion");
		libro.setCategoria(categoria);
		em.persist(libro);
		em.getTransaction().commit();
		
		
	}

}
