package com.arquitecturajava.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ConfiguracionSeguridad  extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// a nivel global 
		http.csrf().disable();
		//abrimos el acceso a las url de webapi que no son procesadas por spring security
		http.authorizeRequests().antMatchers("/webapi/**").permitAll();
		http.authorizeRequests().antMatchers("/**").hasRole("BASICO").and().formLogin();
		super.configure(http);
	}
	
	 @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	        auth
	            .inMemoryAuthentication()
	                .withUser("cecilio").password("miclave").roles("BASICO");
	        
	    }
	
	
}
