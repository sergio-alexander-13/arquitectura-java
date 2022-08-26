package com.arquitecturajava.ejemplo002.servicios;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.ejemplo002.negocio.Curso;

public class ServicioCursos {

	private static List<Curso> listaCursos = new ArrayList<Curso>();

	static {

		Curso c1 = new Curso("java", 1);
		Curso c2 = new Curso("net", 1);
		Curso c3 = new Curso("php", 2);

		listaCursos.add(c1);
		listaCursos.add(c2);
		listaCursos.add(c3);

	}

	public Curso buscarUno(String nombre) {

		for (Curso c : listaCursos) {

			if (c.getNombre().equals(nombre)) {

				return c;
			}
		}
		return null;

	}
	public List<Curso> buscarPorNombre(String nombre) {
		
		if (nombre.equals("")) {
			
			return buscarTodos();
		}
		
		List<Curso> lista= new ArrayList<Curso>();
		for (Curso c : listaCursos) {

			if (c.getNombre().startsWith(nombre)) {

				lista.add(c);
			}
		}
		return lista;

	}
	

	public List<Curso> buscarTodos() {

		return listaCursos;

	}

	public void insertar(Curso c) {

		listaCursos.add(c);
	}

	public void borrar(Curso c) {
		listaCursos.remove(c);
	}

}
