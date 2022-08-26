package com.arquitecturajava.ejemplo002.controladores.acciones;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arquitecturajava.ejemplo002.servicios.ServicioCursos;

public class ListaCursosAccion implements Accion {

	@Override
	public void ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServicioCursos sc = new ServicioCursos();
		RequestDispatcher despachador = request.getRequestDispatcher("/listaCursos.jsp");
		request.setAttribute("listaCursos", sc.buscarTodos());
		despachador.forward(request, response);
		

	}

}
