package com.arquitecturajava.escuela;

import java.util.ArrayList;
import java.util.List;

public class Clase {

	private String nombre;
	private List<Alumno> alumnos = new ArrayList<Alumno>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Clase(String nombre, List<Alumno> alumnos) {
		super();
		this.nombre = nombre;
		this.alumnos = alumnos;
	}

	public Clase() {
		super();
	}

	public void addAlumno(Alumno alumno) {

		this.alumnos.add(alumno);
	}

	public void removeAlumno(Alumno alumno) {

		this.alumnos.remove(alumno);

	}

	public double getMedia() {

		double total = 0;
		for (Alumno alumno : alumnos) {
			total += alumno.getNotaMedia();

		}
		return total / alumnos.size();
	}

	// para la mejor nota de toda la clase
	// la mejor nota entre todos los alumnos
	public Nota getMejorNota() {
		// como de bueno es ??
		
		double mejor = 0;
		Nota mejorNota = null;

		for (Alumno alumno : alumnos) {
			// getMejorNota continuamente
			Nota nota= alumno.getMejorNota();
			if (nota.getValor()>mejor) {
				mejor=nota.getValor();
				mejorNota=nota;
			}
		}
		return mejorNota;
	}

}
