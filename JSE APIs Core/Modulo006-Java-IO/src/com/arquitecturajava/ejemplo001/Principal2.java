package com.arquitecturajava.ejemplo001;

import java.io.File;
import java.io.IOException;

public class Principal2 {

	public static void main(String[] args) {
	
		
			//acceder al fichero de disco
			File mifichero= new File("mifichero.txt");
			System.out.println(mifichero.getAbsolutePath());
			System.out.println(mifichero.getName());
			System.out.println(mifichero.isDirectory());
			
			
	

	}

}
