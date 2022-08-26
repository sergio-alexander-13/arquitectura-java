package com.arquitecturajava;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal1Spring {

	public static void main(String[] args) {
		
		//AnnotationConfigApplicationContext contexto= new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
	
		try {
			FacturaRepository fr= new FacturaRepository();
			Factura f= new Factura(1,"tablet",200);
			fr.insertar(f);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
