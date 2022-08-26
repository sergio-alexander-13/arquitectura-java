package com.arquitecturajava.ejemplo001;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal6 {

	public static void main(String[] args) {
	
	
			
		Path ruta=Paths.get("mifichero.txt");
		
		System.out.println(ruta.getFileName());
		System.out.println(ruta.toAbsolutePath());
		
		Path ruta2=Paths.get("C:\\Users\\arqui\\workspaceAPIs\\JavaAPISModulo6\\mifichero.txt");
		
		for(Path subruta : ruta2) {
			
			System.out.println(subruta.getFileName());
		}
	}

}
