package com.arquitecturajava.ejemplo003;

import java.util.ArrayList;
import java.util.List;

public class Caja<T extends Producto> {
	
	private List<T> lista= new ArrayList<T>();
	private int tope;
	
	
	
	public Caja(int tope) {
		super();
		this.tope = tope;
	}

	public void add(T elemento) {
		
		if (lista.size()<tope) {
			
			lista.add(elemento);
		}
	
	}
	
	public void borrar(T elemento) {
		
		lista.remove(elemento);
	}

	public List<T> getLista() {
		return lista;
	}
	
	public double precioTotal() {
		
		double total=0;
		for (T mitipo: lista) {
			
			total=total+mitipo.getPrecio();
			
		}
		return total;
	}

}
