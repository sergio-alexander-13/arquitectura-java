package com.arquitecturajava.escuela;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String nombre;
	private List<Nota> notas = new ArrayList<Nota>();

	public void addNota(Nota nota) {

		this.notas.add(nota);

	}

	public void removeNota(Nota nota) {

		this.notas.remove(nota);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	public Alumno(String nombre, List<Nota> notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}

	public Alumno() {
		super();
	}

	public Alumno(String nombre) {
		this.nombre= nombre;
	}

	public int getSobreSalientes() {

		int sobreSalientes = 0;
		for (Nota nota : this.getNotas()) {

			if (nota.getValor() >= 9) {

				sobreSalientes++;
			}
		}
		return sobreSalientes;
	}
	
	public int getSuspensos() {

		int suspensos = 0;
		for (Nota nota : this.getNotas()) {

			if (nota.getValor() < 5) {

				suspensos++;
			}
		}
		return suspensos;
	}
	
	public int getMuyDeficientes() {

		int deficientes = 0;
		for (Nota nota : this.getNotas()) {

			if (nota.getValor() < 3) {

				deficientes++;
			}
		}
		return deficientes;
	}
	
	public Nota getMejorNota() {
		
		double mejor=0;
		Nota mejorNota=null;
		
		for (Nota nota:notas) {
			
			if (nota.getValor()>=mejor) {
				mejor= nota.getValor();
				mejorNota=nota;
			}
			
		}
		return mejorNota;
	}
	
	public Nota getPeorNota() {

		double peor = 10;
		Nota notaPeor = null;
		for (Nota nota : notas) {

			if (nota.getValor() < peor) {
				peor = nota.getValor();
				notaPeor = nota;
			}
		}
		return notaPeor;

	}

	public double getNotaMedia() {
		//total tiene que comenzar en cero
		
		// que un grupo de pruebas unitarias falle 
		// es casi peor que no tener pruebas unitarias
		double total=0;
		for (Nota nota: notas) {
			total+=nota.getValor();
			
			
		}
		return total/notas.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Alumno other = (Alumno) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
