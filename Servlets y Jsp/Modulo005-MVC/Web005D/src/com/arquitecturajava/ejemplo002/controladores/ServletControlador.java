package com.arquitecturajava.ejemplo002.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arquitecturajava.ejemplo002.controladores.acciones.Accion;
import com.arquitecturajava.ejemplo002.controladores.acciones.CursoFiltrarNombre;
import com.arquitecturajava.ejemplo002.controladores.acciones.CursosBorrarAccion;
import com.arquitecturajava.ejemplo002.controladores.acciones.CursosInsertarAccion;
import com.arquitecturajava.ejemplo002.controladores.acciones.FormularioCursoAccion;
import com.arquitecturajava.ejemplo002.controladores.acciones.ListaCursosAccion;
import com.arquitecturajava.ejemplo002.negocio.Curso;
import com.arquitecturajava.ejemplo002.servicios.ServicioCursos;

/**
 * Servlet implementation class ServletControlador
 */
@WebServlet("/ServletControlador/*")
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		procesarPeticion(request, response);
	}

	protected void procesarPeticion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		String accion = request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/") + 1);
		ServicioCursos sc = new ServicioCursos();
		RequestDispatcher despachador = null;
		Accion miaccion=null;
		
		if (accion.equals("lista")) {

					miaccion= new ListaCursosAccion();
					miaccion.ejecutar(request, response);
			
		} else if (accion.equals("formularioInsertar")) {

				miaccion=new FormularioCursoAccion();
				miaccion.ejecutar(request, response);
		} else if (accion.equals("borrar")) {

				miaccion=new CursosBorrarAccion();
				miaccion.ejecutar(request, response);
		}else if (accion.equals("filtrar")) {

			miaccion=new  CursoFiltrarNombre();
			miaccion.ejecutar(request, response);
	}else {
			
			miaccion= new CursosInsertarAccion();
			miaccion.ejecutar(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		procesarPeticion(request, response);
	}

}
