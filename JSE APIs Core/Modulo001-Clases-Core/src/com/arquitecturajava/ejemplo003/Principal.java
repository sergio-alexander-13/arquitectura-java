package com.arquitecturajava.ejemplo003;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		System.out.print("Introduce el nombre:");
		Scanner sc= new Scanner(System.in);
		String nombre= sc.nextLine();
		System.out.print("Introduce el apellido:");
		String apellido= sc.nextLine();
		System.out.println(nombre);
		System.out.println(apellido);
		
		int numero= sc.nextInt();
		System.out.println(numero);
		sc.close();
		

	}

}
