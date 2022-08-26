package com.arquitecturajava.ejemplo007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Principal3 {

	public static void main(String[] args) {
		
		String fechaTexto="10/12/2017";
		
		//patrones a nivel de api
		//patrones porque existen muchos y son similares
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date fecha= df.parse(fechaTexto);
			System.out.println(fecha);
			SimpleDateFormat df2= new SimpleDateFormat("dd/MMMM/yyyy");
			System.out.println(df2.format(fecha));
			
			Calendar calendario= Calendar.getInstance();
			calendario.setTime(fecha);
			System.out.println(calendario.get(Calendar.YEAR));
			System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
			System.out.println(calendario.get(Calendar.MONTH));
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
