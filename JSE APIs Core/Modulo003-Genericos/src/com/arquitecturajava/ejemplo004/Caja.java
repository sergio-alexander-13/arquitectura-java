package com.arquitecturajava.ejemplo004;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Caja<T> implements Iterable<T> {

	protected List<T> lista = new ArrayList<T>();
	protected int tope;

	public void add(T elemento) {
		
		if (lista.size()<tope) {
			
			lista.add(elemento);
		}
	
	}
	public void borrar(T elemento) {
		
		lista.remove(elemento);
	}

	// voy a conseguir una mayor naturalidad 
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return lista.iterator();
	}
	
	

}
