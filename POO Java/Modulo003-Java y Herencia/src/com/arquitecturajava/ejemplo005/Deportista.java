package com.arquitecturajava.ejemplo005;

public class Deportista extends Persona {

	public Deportista(String nombre) {
		super(nombre);
		
	}
	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	//anotacion
	@Override
	public void andar() {
		
		System.out.println(getNombre()+" camina a 10km/h");
	}
	
	
}
