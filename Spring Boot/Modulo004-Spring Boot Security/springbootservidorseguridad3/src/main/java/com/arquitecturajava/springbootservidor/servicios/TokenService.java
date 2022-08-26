package com.arquitecturajava.springbootservidor.servicios;

import java.util.Base64;
import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenService {

	
	public String creaToken(String usuario,String claveEncriptar,Date expiracion) {
		
		
		String JWT = Jwts.builder()
		         .setSubject(usuario)
		         .setExpiration(expiracion)
		         //es la parte en la cual nosotros definimos la clave de encriptacion y el algoritmo para generar el hash
		         .signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encodeToString((claveEncriptar.getBytes())))
		         //generando el hash completo
		         .compact();
			
			return JWT;
		
	}
	
	//nosotros leamos el token obtendremos el usuario
	public String leeToken(String tokenReal, String claveEncriptar) {
		String usuario = Jwts.parser()
		     .setSigningKey( Base64.getEncoder().encodeToString((claveEncriptar.getBytes())))
		     .parseClaimsJws(tokenReal)
		     .getBody()
		     .getSubject();
		System.out.println("el usuario es :"+usuario);
		return usuario;
	}
	
}
