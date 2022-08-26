package com.arquitecturajava.ejemplo001;

import java.io.File;
import java.io.IOException;

public class Principal3 {

	public static void main(String[] args) {
	
		
		//acceder al fichero de disco
		//File mifichero= new File("micarpeta");
		//mifichero.mkdir();
		
		try {
			File mifichero2= new File("micarpeta","mifichero4.txt");
			mifichero2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	

	}

}
