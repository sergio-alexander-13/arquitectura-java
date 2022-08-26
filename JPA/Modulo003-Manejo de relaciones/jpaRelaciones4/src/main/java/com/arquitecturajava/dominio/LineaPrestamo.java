package com.arquitecturajava.dominio;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="lineaprestamos")
public class LineaPrestamo {

	//la clave primaria es un objeto compuesto
	@EmbeddedId
	private LineaPrestamoPK lineaPK;
	
	
	@ManyToOne
	@JoinColumn(name="ejemplares_codigo")
	private Ejemplar ejemplar;
	
	// esto que es ??
	@ManyToOne
	@JoinColumn(name="prestamos_id", insertable=false, updatable=false)
	private Prestamo prestamo;
	

	public Ejemplar getEjemplar() {
		return ejemplar;
	}


	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}


	public Prestamo getPrestamo() {
		return prestamo;
	}


	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}


	public LineaPrestamoPK getLineaPK() {
		return lineaPK;
	}


	public void setLineaPK(LineaPrestamoPK lineaPK) {
		this.lineaPK = lineaPK;
	}

	public LineaPrestamo() {
		super();
	}


	public LineaPrestamo(int numero, Prestamo prestamo,Ejemplar ejemplar) {
		
		this.lineaPK= new LineaPrestamoPK(numero,prestamo.getId());
		this.prestamo=prestamo;
		this.ejemplar=ejemplar;
	}
	
}
