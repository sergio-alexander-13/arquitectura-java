package com.arquitecturajava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletFormularioNombre")
public class ServletFormularioNombre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw= response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<form method='post' action='ServletDestino'>");
		pw.println("<input type='hidden' name='nombre' value='" +request.getParameter("nombre")+"'>");
		pw.println("Apellidos:<input type='text' name='apellidos'/>");
		pw.println("<input type='submit' value='aceptar'>");
		pw.println("<html>");
		
		
	}

}
