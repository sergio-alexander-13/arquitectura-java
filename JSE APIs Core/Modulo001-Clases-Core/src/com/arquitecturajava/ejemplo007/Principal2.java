package com.arquitecturajava.ejemplo007;

import java.util.Calendar;
import java.util.Date;

public class Principal2 {

	public static void main(String[] args) {
		
		
		Calendar calendario= Calendar.getInstance();
		
		calendario.set(Calendar.YEAR,2017 );
		calendario.set(Calendar.MONTH,0 );
		calendario.set(Calendar.DAY_OF_MONTH,1 );
		
		Date fecha= calendario.getTime();
		
		calendario.set(Calendar.YEAR,2018 );
		calendario.set(Calendar.MONTH,0 );
		calendario.set(Calendar.DAY_OF_MONTH,1 );
		
		Date fecha2= calendario.getTime();
		
		System.out.println(fecha);
		
		System.out.println(fecha2);
		
		

	}

}
