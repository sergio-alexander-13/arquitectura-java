package com.arquitecturajava.ejemplo003;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;

public class Principal3 {

	public static void main(String[] args) {

		try (	
				FileOutputStream salida = new FileOutputStream(Paths.get("texto3.txt").toFile());
				
				GZIPOutputStream salidaComprimida= new GZIPOutputStream(salida);
				BufferedOutputStream salidaCache= new BufferedOutputStream(salidaComprimida);
				OutputStreamWriter transformador= new OutputStreamWriter(salidaCache);
				BufferedWriter escritorTexto = new BufferedWriter(transformador);

		) {

			for (int i = 0; i < 1000; i++) {

				escritorTexto.write("hola esto es un texto" + i);
				escritorTexto.newLine();
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
