package com.arquitecturajava.ejemplo001;

public class Principal {

	public static void main(String[] args) {
		
		//numero
		int numero=7;
		
		//objeto de tipo coraza 
		Integer mientero= new Integer(numero);
		
		// toString 
		String numeroCadena=mientero.toString();
		
		System.out.println(numero);
		
		System.out.println(numeroCadena);
		
		String numero2="14";
		String numero3="25";
		
		System.out.println(numero2+numero3);
		
		int resultado=Integer.parseInt(numero2)+Integer.parseInt(numero3);
		System.out.println(resultado);
		
		int nuevoNumero= mientero.intValue()+5;
		System.out.println(nuevoNumero);
		
		

	}

}
