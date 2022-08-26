package com.arquitecturajava.springbootservidor;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		// sino hacemos este paso , spring security no funcionara correctamente
		
		 PasswordEncoder codificador = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		
		auth.inMemoryAuthentication().withUser("cecilio").password(codificador.encode("miclave")).roles("ADMINISTRADOR");
		
		
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		//es un patron viene de ant que es una herramienta clasica
		//es un patron para urls 
		http.authorizeRequests()
		.antMatchers(HttpMethod.POST,"/webapi/login").permitAll()
		.anyRequest().authenticated();
		
	}

	
	
	

}
