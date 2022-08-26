package com.arquitecturajava.ejemplo001;

import java.io.File;
import java.io.IOException;

public class Principal4 {

	public static void main(String[] args) {
	
		File micarpeta= new File("micarpeta");
		
		File[] ficheros= micarpeta.listFiles();
		
		for (int i=0;i<ficheros.length;i++) {
			
			System.out.println(ficheros[i].getName());
		}
			
	

	}

}
