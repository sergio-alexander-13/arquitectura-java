package com.arquitecturajava.ejemplo002;

public class Deportista extends Persona {

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
