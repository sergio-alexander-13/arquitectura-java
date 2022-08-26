package com.arquitecturajava.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.arquitecturajava.dominio.Categoria;
import com.arquitecturajava.dominio.Libro;

public class Principal006Cascadas {

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
				// construccion de objetos
				Categoria categoria= new Categoria("javascript","libros de Javascript");
				Libro libro= new Libro("4ABC","Angular","ana",fecha,4);
				Libro libro2= new Libro("5ABC","React","gema",fecha,5);

				
				
				// aplico los metodos de la relacion
				categoria.addLibros(libro,libro2);
				
				// persistir con JPA ????? 
				
				//la categoria por cascada persiste los libros
				em.persist(categoria);
				
				
				em.getTransaction().commit();
				
	}

}
