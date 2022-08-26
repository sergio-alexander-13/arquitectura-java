package com.arquitecturajava.ejemplo002.controladores.acciones;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Accion {
	
	public void ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
