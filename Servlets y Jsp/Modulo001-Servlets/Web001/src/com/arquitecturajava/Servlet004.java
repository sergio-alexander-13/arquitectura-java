package com.arquitecturajava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet004
 */
public class Servlet004 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	//variable estara compartida por todas las peticiones
	private int peticiones;
   
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		//configurar nuestro servlet con un valor inicial de 5
		peticiones= Integer.parseInt(config.getInitParameter("inicio"));
		
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter pw= response.getWriter();
		pw.println(peticiones);
		peticiones++;
		pw.close();
		
		
	}


}
