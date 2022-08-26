package com.arquitecturajava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
		  prePostEnabled = true, 
		  securedEnabled = true, 
		  jsr250Enabled = true)
public class ConfiguradorSeguridad extends WebSecurityConfigurerAdapter {

	
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// ??
		http.csrf().disable().authorizeRequests().antMatchers("/**").hasAnyRole("administrador","avanzado","basico")
		//.and().formLogin();
		.and().formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/listaFacturas",true);
		super.configure(http);
	}

	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// un autenticador en memoria
		// solo tenemos un usuario , que es como tener la base de datos
		// con un registro
		auth.inMemoryAuthentication()
		.withUser("cecilio")
		.password("{noop}miclave")
		.roles("administrador")
		//añado dos usuarios adicionales y cada uno con un rol
		// para cuando nos logeemos poder ver las diferencias
		.and().withUser("pedro").password("{noop}pedro").roles("avanzado")
		.and().withUser("gema").password("{noop}gema").roles("basico");

		
		
		super.configure(auth);
	}

	
}
