package com.arquitecturajava.ejemplo007;

import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
	
		Date dia1= new Date();
		System.out.println(dia1);
		
		
		//problemas importantes
		Date dia2= new Date(10000);
		
		System.out.println(dia2);
		
		Calendar micalendario=Calendar.getInstance();
		Date fecha=micalendario.getTime();
		micalendario.set(Calendar.YEAR,2018);
		micalendario.set(Calendar.MONTH, Calendar.APRIL);
		micalendario.set(Calendar.DAY_OF_MONTH, 2);
		Date fecha2= micalendario.getTime();
		System.out.println(fecha2);
	}

}
