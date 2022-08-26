package com.arquitecturajava.ejemplo003;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;

public class Principal4 {

	public static void main(String[] args) {

		String linea = null;
		try (FileInputStream entrada = new FileInputStream(Paths.get("texto3.txt").toFile());

				GZIPInputStream entradaComprimida = new GZIPInputStream(entrada);
				BufferedInputStream entradaCache = new BufferedInputStream(entradaComprimida);
				InputStreamReader transformador = new InputStreamReader(entradaCache);
				BufferedReader lectorTexto = new BufferedReader(transformador);

		) {

			while ((linea = lectorTexto.readLine()) != null) {

				System.out.println(linea);
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
