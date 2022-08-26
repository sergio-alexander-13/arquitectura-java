package com.arquitecturajava.ejemplo004;

public class Trabajador {
	
	private int dias;

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public Trabajador(int dias) {
		super();
		this.dias = dias;
	}
	
	// los dias que el trabajador esta trabajando con nosotros
	public synchronized int  addDia() {
		
		this.dias=this.dias+1;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.dias;
	}

}
