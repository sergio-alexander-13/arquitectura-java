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
import com.arquitecturajava.dominio.LineaPrestamo;
import com.arquitecturajava.dominio.Prestamo;

public class Principal001 {

	public static void main(String[] args) {
		
		// unidad de persistencia
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em= emf.createEntityManager();
		
		String textoFecha= "1/01/2020";
		SimpleDateFormat ffecha= new SimpleDateFormat("d/M/yyyy");
		Date fecha=null;
		try {
			fecha= ffecha.parse(textoFecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Prestamo p= new Prestamo(10,fecha);
		
		Ejemplar e= em.find(Ejemplar.class, "1-1AB-2020");
		
		
		
		LineaPrestamo linea= new LineaPrestamo(1,p,e);
		// ojo que son dos relacions la de prestamo y la de el ejemplar
		p.addLinea(linea);
		e.addLinea(linea);
		
		em.getTransaction().begin();
		em.persist(p);
		em.persist(linea);
		em.getTransaction().commit();
	
	
	}

}
