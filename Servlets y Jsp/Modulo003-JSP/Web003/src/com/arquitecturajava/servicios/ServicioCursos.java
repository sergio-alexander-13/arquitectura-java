package com.arquitecturajava.servicios;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.Curso;

public class ServicioCursos {

	public List<Curso> buscarTodos(){
		
		
		Curso c1= new Curso("java",1);
		Curso c2= new Curso("net",1);
		Curso c3= new Curso("php",2);
		//acceso a estas clases de java 
		List<Curso> listaCursos= new ArrayList<Curso>();
		listaCursos.add(c1);
		listaCursos.add(c2);
		listaCursos.add(c3);
		
		return listaCursos;

		
	}
}
