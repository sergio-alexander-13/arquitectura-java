package com.arquitecturajava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet001
 */
@WebServlet(
		urlPatterns = { "/Servlet001" }, 
		initParams = { 
				@WebInitParam(name = "numero", value = "5", description = "numero de inicio")
		})
public class Servlet001 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private int peticiones;
  
	@Override
	public void init(ServletConfig config) throws ServletException {
	
		peticiones= Integer.parseInt(config.getInitParameter("numero"));
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		pw.println(peticiones);
		peticiones++;
	
	
	}

	
}
