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
import com.arquitecturajava.dominio.Ejemplar;
import com.arquitecturajava.dominio.Libro;
import com.arquitecturajava.dominio.Prestamo;

public class Principal001 {

	public static void main(String[] args) {
		
		// unidad de persistencia
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em= emf.createEntityManager();
	
		Prestamo p= em.find(Prestamo.class, 1);
		List<Ejemplar> lista=p.getEjemplares();
		
		for (Ejemplar e:lista) {
			
			System.out.println(e.getLibro().getTitulo());
		}
		
//		Ejemplar e= em.find(Ejemplar.class, "1-2AC-2020");
//		
//		List<Prestamo> prestamos= e.getPrestamos();
//		
//		for (Prestamo p: prestamos) {
//			
//			System.out.println(p.getId());
//			System.out.println(p.getFecha());
//		}
		
	}

}
