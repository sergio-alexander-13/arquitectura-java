package com.arquitecturajava.ejemplo004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletSessionCurso1
 */
@WebServlet("/ServletSessionCurso1")
public class ServletSessionCurso1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession misession= request.getSession();
		Persona persona=(Persona)misession.getAttribute("persona");
		if(request.getParameter("cursonombre")!=null) {
			
			persona.addCurso(request.getParameter("cursonombre"));
		}
		
		
		
	
		PrintWriter pw= response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		
		if (persona!=null) {
			
			for (String curso : persona.getCursos()){
				
				pw.println("<p>"+curso+"<p>");
			}
		}else {
			pw.println("la session esta vacia");
			
		}
		
		
		pw.println("<a href='FormularioCurso.html'>volver al formulario</a>");
		
		pw.println("</body>");
		pw.println("</html>");
		
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

}
