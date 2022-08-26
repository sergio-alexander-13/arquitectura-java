package com.arquitecturajava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet003
 */
public class Servlet003 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		
		for (int i = 0; i <10; i++) {
			pw.println("<p>hola desde un servlet</p>");
		}
		
		pw.println("</body>");
		pw.println("</html>");
	}



}
