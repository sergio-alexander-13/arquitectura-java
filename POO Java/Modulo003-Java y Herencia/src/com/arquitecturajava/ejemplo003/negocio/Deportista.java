package com.arquitecturajava.ejemplo003.negocio;

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
		//metodos de la clase superior y reutilizar el codigo que tenemos
		
		super.imprimeTextoAndar();
		System.out.println(" 10 km/h");
	}
	
	
}
