package com.arquitecturajava.ejemplo002;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {

	public static void main(String[] args) {
	
		int dato;
		
		try(InputStream entrada= new FileInputStream(Paths.get("java-logo.png").toFile());
			OutputStream salida= new FileOutputStream(Paths.get("java-logo2.png").toFile())	
				){
			
			
			while((dato=entrada.read())!=-1) {
				

				salida.write(dato);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
