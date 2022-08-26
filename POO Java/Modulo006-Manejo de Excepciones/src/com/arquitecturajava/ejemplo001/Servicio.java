package com.arquitecturajava.ejemplo001;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servicio {

	static void miMetodo() throws Exception {
		try {
			File f = new File("f://hola.txt");
			f.createNewFile();
			DateFormat df= new SimpleDateFormat("dd/MM/YYYY");
			Date mifecha= df.parse("03/05/2017");
			
			// linea genera una excepcion
			System.out.println("el fichero se ha creado correctamente");
			
			System.out.println(mifecha);
			
			//seria mas optima
		} catch (IOException | ParseException e) {
			
			System.out.println("log a fichero:el método falla por "+ e.getMessage());
			throw e;
			
		} finally {
			// se ejecuta
			System.out.println("cerrando todos los recursos");
		}
	}

}
