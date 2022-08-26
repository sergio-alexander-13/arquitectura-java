package com.arquitecturajava.test.rest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.http.Method.GET;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.arquitecturajava.bo.Noticia;

import io.restassured.RestAssured;
public class NoticiasRESTTest {
	
	
	@Before
	public  void setupStatic() {
		Persistence.generateSchema("curso", null);
		
	}
	
	@BeforeClass
	public static void setup() {
		
		RestAssured.port=8080;
		RestAssured.baseURI="http://localhost";
		RestAssured.basePath="/web/webapi";
		
	}
	
	
	@Test
	public void obtenerNoticiasGet() {
		
		
		// cuando pidas /noticias entonces el cuerpo contiene java 9 ha salido 
		when().request(GET,"/noticias").then().body(containsString("java 9 ha salido"));
		
		
	}
	
	@Test
	public void obtenerUnaNoticiaGet() {
		
		
		// cuando pidas /noticias entonces el cuerpo contiene java 9 ha salido 
		when().request(GET,"/noticias/java 9 ha salido").then().body("titulo",equalTo("java 9 ha salido"));
	}
	@Test
	public void insertarNoticiaPOST() throws ParseException {
		
		SimpleDateFormat formato= new SimpleDateFormat("dd/MM/YYYY");
		Date fecha= formato.parse("25/01/2018");
		Noticia noticia= new Noticia("java 8 streams","cecilio",fecha);
		
		//dado un objeto json de noticia cuando realicemos un post nos devuelve ok
		given().contentType("application/json").body(noticia).when().post("/noticias").then().statusCode(200);
	
	}
	
	@Test
	public void actualizarNoticiaPUT() throws ParseException {
		
		
		//nueva noticia que sera la que actualice la noticia principal
		SimpleDateFormat formato= new SimpleDateFormat("dd/MM/YYYY");
		Date fecha= formato.parse("25/01/2018");
		Noticia noticia= new Noticia("java 9 ha salido","pedro",fecha);
		
		//dado un objeto json de noticia cuando realicemos un post nos devuelve ok
		given().contentType("application/json").body(noticia).when().put("/noticias/java 9 ha salido").then().statusCode(200);
		
	}
	
	
	
	@Test
	public void borrarNoticiaDELETE() {
		
		when().delete("/noticias/java 9 ha salido").then().statusCode(200);
	
	}
	
	
	
}
