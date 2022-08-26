package com.arquitecturajava.ejemplo008;

import java.time.LocalDate;
import java.time.Period;

public class Principal {

	public static void main(String[] args) {
	
		LocalDate mifecha= LocalDate.now();
		LocalDate mifecha2= LocalDate.of(2016, 10, 10);
		System.out.println(mifecha.getMonth());
		System.out.println(mifecha.getDayOfMonth());
		System.out.println(mifecha.getYear());
		
		System.out.println(mifecha2.isBefore(mifecha));
		
		// inmutabilidad no de los Strings ahora mismo de las fechas
		LocalDate fecha3=mifecha2.withDayOfMonth(20);

		System.out.println(fecha3.getDayOfMonth());
		
		LocalDate fecha4= LocalDate.of(2015, 1, 1);
//		LocalDate fecha5=fecha4.plusYears(1);
//		LocalDate fecha6= fecha5.plusMonths(1);
		
		System.out.println(fecha4.plusYears(1).plusMonths(1));
		
		Period periodo=Period.between(mifecha2, mifecha);
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getYears());
		
		
	}

}
