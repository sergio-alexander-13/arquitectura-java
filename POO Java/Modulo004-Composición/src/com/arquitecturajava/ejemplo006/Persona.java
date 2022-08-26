package com.arquitecturajava.ejemplo006;

import java.util.ArrayList;

public class Persona {

	
	private String nombre;
	private ArrayList<Persona> amigos= new ArrayList<Persona>();
	
	public void addAmigo(Persona persona) {
		
		amigos.add(persona);
	}
	
	
	
	public ArrayList<Persona> getAmigos() {
		return amigos;
	}



	public void eliminarAmigo(Persona persona) {
		
		amigos.remove(persona);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amigos == null) ? 0 : amigos.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (amigos == null) {
			if (other.amigos != null)
				return false;
		} else if (!amigos.equals(other.amigos))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
	
}
