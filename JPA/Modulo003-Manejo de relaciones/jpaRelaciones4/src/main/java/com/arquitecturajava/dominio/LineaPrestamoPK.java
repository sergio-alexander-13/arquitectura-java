package com.arquitecturajava.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LineaPrestamoPK implements Serializable{

	private static final long serialVersionUID = 1L;
	@Column(name="numero")
	private int numero;
	@Column(name="prestamos_id")
	private int idPrestamo;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public LineaPrestamoPK() {
		super();
	}
	public LineaPrestamoPK(int numero, int idPrestamo) {
		super();
		this.numero = numero;
		this.idPrestamo = idPrestamo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPrestamo;
		result = prime * result + numero;
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
		LineaPrestamoPK other = (LineaPrestamoPK) obj;
		if (idPrestamo != other.idPrestamo)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
}
