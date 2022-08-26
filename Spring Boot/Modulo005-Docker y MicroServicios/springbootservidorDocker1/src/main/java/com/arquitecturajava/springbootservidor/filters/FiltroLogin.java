package com.arquitecturajava.springbootservidor.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.AnyRequestMatcher;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.cors.CorsUtils;

import com.arquitecturajava.springbootservidor.mappings.Usuario;
import com.arquitecturajava.springbootservidor.servicios.HttpParserService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FiltroLogin extends AbstractAuthenticationProcessingFilter {

	private HttpParserService httpParserService;
	
	
	public FiltroLogin(String url ,AuthenticationManager manager) {
		
		super(url);
		httpParserService= new HttpParserService();
		setAuthenticationManager(manager);
		
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException, IOException, ServletException {
		
		
		
	
		
		
		Usuario usuario = new ObjectMapper().readValue(request.getInputStream(),Usuario.class);
		System.out.println(usuario.getNombre());
		System.out.println(usuario.getPassword());
		UsernamePasswordAuthenticationToken usuarioSpring = new UsernamePasswordAuthenticationToken(usuario.getNombre(), usuario.getPassword());
		return getAuthenticationManager().authenticate(usuarioSpring);
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication autentication) throws IOException, ServletException {
		
		String nombreUsuario= autentication.getName();
		httpParserService.creaToken(response, nombreUsuario);
		
	}
	
	
	
	

}
