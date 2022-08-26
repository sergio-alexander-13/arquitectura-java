package com.arquitecturajava.ejemplo002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCrearCookie
 */
@WebServlet("/ServletCrearCookie")
public class ServletCrearCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		Cookie c= new Cookie("nombre","pepe");
		c.setMaxAge(60);
		response.addCookie(c);
		
		PrintWriter pw= response.getWriter();
		pw.println("cookie creada");
		pw.close();
	}

	

}
