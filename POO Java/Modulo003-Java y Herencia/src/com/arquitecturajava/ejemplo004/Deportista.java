package com.arquitecturajava.ejemplo004;

public class Deportista extends Persona {

	private String deporte;

	public Deportista(String nombre) {
		//llamara al constructor de la clase superior que tenga un parametro con String
		super(nombre);
	}
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
