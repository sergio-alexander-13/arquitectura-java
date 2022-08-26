package com.arquitecturajava.ejemplo004;

public class CajaProducto<T extends Producto> extends Caja<T> {
	
	public CajaProducto(int tope) {
		super();
		this.tope = tope;
	}

	// el de precio total porque solo se puede aplicar a productos
	public double precioTotal() {
		
		double total=0;
		for (T mitipo: lista) {
			
			total=total+mitipo.getPrecio();
			
		}
		return total;
	}

}
