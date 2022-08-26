package com.arquitecturajava.ejemplo001;

import java.io.File;
import java.io.IOException;

public class Principal1 {

	public static void main(String[] args) {
	
		
		try {
			File mifichero= new File("mifichero.txt");
			mifichero.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
