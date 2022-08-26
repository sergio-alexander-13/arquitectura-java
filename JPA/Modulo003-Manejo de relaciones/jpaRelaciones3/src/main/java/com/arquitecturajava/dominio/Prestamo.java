package com.arquitecturajava.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Prestamos")
public class Prestamo {
	@Id
	private int id;
	private Date fecha;
	@ManyToMany
	@JoinTable(name="PrestamosEjemplares",
	joinColumns = @JoinColumn(name="prestamos_id", nullable=false),
	inverseJoinColumns=@JoinColumn(name="ejemplares_codigo",nullable=false))
	private List<Ejemplar> ejemplares= new ArrayList<Ejemplar>();

	public List<Ejemplar> getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(List<Ejemplar> ejemplares) {
		this.ejemplares = ejemplares;
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
