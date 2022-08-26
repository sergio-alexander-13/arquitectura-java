package com.arquitecturajava.ejemplo004;

public class Bucles {

	public static void main(String[] args) {
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("hola"+i);
		}
		
		System.out.println("***********");
		int j=0;
		
		while (j<10) {
			System.out.println("hola" + j);
			j++;
		}
		System.out.println("***********");
		
		int k=0;
		do {
			System.out.println("hola" + k);
			k++;
		} while (k<10);

		System.out.println("***********");
	}

}
