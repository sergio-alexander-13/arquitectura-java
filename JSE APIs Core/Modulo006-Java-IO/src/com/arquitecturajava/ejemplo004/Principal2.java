package com.arquitecturajava.ejemplo004;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.SecretKeySpec;

public class Principal2 {

	public static void main(String[] args) {

		String claveTexto = "tTRJKf74ayM=";

		// clave en formato byte
		try {
			byte[] clave = Base64.getDecoder().decode(claveTexto);

			Key key = new SecretKeySpec(clave, "DES");

			Cipher cifrador = Cipher.getInstance("DES");

			cifrador.init(Cipher.DECRYPT_MODE, key);

			BufferedReader lector = new BufferedReader(
					new InputStreamReader(new CipherInputStream(new FileInputStream("textoEncriptado.txt"), cifrador)));
			
			System.out.println(lector.readLine());
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
