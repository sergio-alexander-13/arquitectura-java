package com.arquitecturajava.ejemplo002.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arquitecturajava.ejemplo002.negocio.Curso;
import com.arquitecturajava.ejemplo002.servicios.ServicioCursos;

/**
 * Servlet implementation class ServletControlador
 */
@WebServlet("/ServletControlador/*")
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	procesarPeticion(request, response);
		
		
		
	}
	
	protected void procesarPeticion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//centralizar las peticiones en un unico lugar
		
		String accion=request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1);
	
		if(accion.equals("ServletControlador")) {
			
			ServicioCursos sc= new ServicioCursos();
			List<Curso> lista=sc.buscarTodos();
			RequestDispatcher despachador= request.getRequestDispatcher("/listaCursos.jsp");
			request.setAttribute("listaCursos", lista);
			despachador.forward(request, response);
			
		}else if (accion.equals("formularioInsertar")) {
			
			RequestDispatcher despachador= request.getRequestDispatcher("/formularioCurso.jsp");
			despachador.forward(request, response);
		}else if (accion.equals("borrar")) {
			
			ServicioCursos sc= new ServicioCursos();
			Curso c= new Curso(request.getParameter("nombre"),Integer.parseInt(request.getParameter("nivel")));
			sc.borrar(c);
			RequestDispatcher despachador= request.getRequestDispatcher("ServletControlador");
			despachador.forward(request, response);
			
		}
		
		else {
			
			ServicioCursos sc= new ServicioCursos();
			Curso c= new Curso(request.getParameter("nombre"),Integer.parseInt(request.getParameter("nivel")));
			sc.nuevo(c);
			RequestDispatcher despachador= request.getRequestDispatcher("ServletControlador");
			despachador.forward(request, response);
		
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

}
