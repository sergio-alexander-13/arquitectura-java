package com.arquitecturajava.springbootservidor.test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.arquitecturajava.springbootservidor.servicios.TokenService;

public class TokenTest {

	@Test
	public void testCrearToken() throws ParseException {
		
		TokenService servicio= new TokenService();
		DateFormat formateador=new SimpleDateFormat("dd/MM/yyyy");
		
		String token= servicio.creaToken("cecilio1", "superclave", formateador.parse("01/03/2019"));
		
		assertEquals("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZWNpbGlvMSIsImV4cCI6MTU1MTM5NDgwMH0.W2dzpSV18sTWstbHxlk5ENtM_F5U2JOSi-WxlJLYt9k",token);
		
	}
	@Test
	public void testLeerTokenUsuario() {
		
		
		TokenService servicio= new TokenService();
		String usuario=servicio.leeToken("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZWNpbGlvMSIsImV4cCI6MTU1MTM5NDgwMH0.W2dzpSV18sTWstbHxlk5ENtM_F5U2JOSi-WxlJLYt9k", "superclave");
		assertEquals("cecilio1",usuario);
	}

}
