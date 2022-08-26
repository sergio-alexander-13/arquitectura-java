package com.arquitecturajava.ejemplo005;

public class AdaptadorBrazoAcero implements Girable {
	
	private Rotable brazoAcero;

	public Rotable getBrazoAcero() {
		return brazoAcero;
	}

	public void setBrazoAcero(Rotable ba) {
		this.brazoAcero = ba;
	}

	public AdaptadorBrazoAcero(Rotable ba) {
		super();
		this.brazoAcero = ba;
	}

	@Override
	public void girar() {
		// este es el método que adapta el brazo de acero al robot
		//usando delegacion
		brazoAcero.rotar();
		
	}

	
}
