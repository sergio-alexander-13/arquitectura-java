package com.arquitecturajava.ejemplo003;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal2 {

	public static void main(String[] args) {

		try (FileWriter salida = new FileWriter(Paths.get("texto2.txt").toFile());

				BufferedWriter escritorTexto = new BufferedWriter(salida)

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
