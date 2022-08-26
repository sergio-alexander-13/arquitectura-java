package com.arquitecturajava.ejemplo002;

public class FiltroPrecio implements FiltroLibros {

	@Override
	public boolean test(Libro l) {
		// TODO Auto-generated method stub
		return l.getPrecio()>15;
	}

}
