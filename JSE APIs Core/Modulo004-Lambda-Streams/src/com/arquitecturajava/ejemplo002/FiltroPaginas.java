package com.arquitecturajava.ejemplo002;

public class FiltroPaginas implements FiltroLibros {

	@Override
	public boolean test(Libro l) {
		// TODO Auto-generated method stub
		return l.getPaginas()>400;
	}

}
