package com.arquitecturajava.ejemplo001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet001
 */
@WebServlet("/Servlet001")
public class Servlet001 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//negocia y gestion del formulario
		String nuevoNombre=request.getParameter("nombre").toUpperCase();
		request.setAttribute("nombre", nuevoNombre);
		RequestDispatcher despachador=request.getRequestDispatcher("destino.jsp");
		despachador.forward(request, response);
		
		
	}

}
