package com.arquitecturajava.ejemplo002.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arquitecturajava.ejemplo002.negocio.Curso;
import com.arquitecturajava.ejemplo002.servicios.ServicioCursos;

@Path(value = "/cursos")
public class ServicioREST {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Curso> listaCursos() {
		
			ServicioCursos sc= new ServicioCursos();
			return sc.buscarTodos();
		
		
	}

	@GET
	@Path("/filtro/{nombre:.*}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Curso> filtroPorNombre(@PathParam("nombre") String nombre) {
		
			ServicioCursos sc= new ServicioCursos();
			return sc.buscarPorNombre(nombre);
		
		
	}
	
	
}
