package com.arquitecturajava.ejemplo004;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;


public class Principal {

	public static void main(String[] args) {
		
		try {
			KeyGenerator generador= KeyGenerator.getInstance("DES");
			
			generador.init(56,new SecureRandom());
			
			Key clave= generador.generateKey();
			
			System.out.println(Base64.getEncoder().encodeToString(clave.getEncoded()));
			
			Cipher cifrador= Cipher.getInstance("DES");
			cifrador.init(Cipher.ENCRYPT_MODE, clave);
			
			String mensaje="hola que tal estas";
			
			FileOutputStream salida= new FileOutputStream("textoEncriptado.txt");
			
			CipherOutputStream salidaCifrada= new CipherOutputStream(salida, cifrador);
			
			BufferedWriter salidaTexto= new BufferedWriter(new OutputStreamWriter (salidaCifrada));
			
			salidaTexto.write(mensaje);
			salidaTexto.close();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
