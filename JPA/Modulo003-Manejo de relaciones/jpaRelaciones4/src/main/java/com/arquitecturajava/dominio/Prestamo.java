package com.arquitecturajava.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Prestamos")
public class Prestamo {
	@Id
	private int id;
	private Date fecha;
	@OneToMany(mappedBy="prestamo")
	private List<LineaPrestamo> lineas= new ArrayList<LineaPrestamo>();

	public void addLinea (LineaPrestamo linea) {
		
		this.lineas.add(linea);
		linea.setPrestamo(this);
	}
	
	public void removeLinea (LineaPrestamo linea) {
		
		this.lineas.remove(linea);
	}

	public List<LineaPrestamo> getLineas() {
		return lineas;
	}

	public void setLineas(List<LineaPrestamo> lineas) {
		this.lineas = lineas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Prestamo(int id, Date fecha) {
		super();
		this.id = id;
		this.fecha = fecha;
	}

	public Prestamo(int id) {
		super();
		this.id = id;
	}

	public Prestamo() {
		super();
	}
	
	
}
