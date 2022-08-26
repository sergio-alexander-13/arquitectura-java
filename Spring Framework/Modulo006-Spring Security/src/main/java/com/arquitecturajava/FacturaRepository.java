package com.arquitecturajava;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class FacturaRepository {
	@PersistenceContext
	private EntityManager em;
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Factura> buscarTodas() {

		TypedQuery<Factura> consultaJPA= em.createQuery("select f from Factura f",Factura.class);
		return consultaJPA.getResultList();
	}

	@Transactional
	public void insertar(Factura factura) {
		em.persist(factura);
	}

	@Transactional
	public void borrar(Factura factura) {
		// primero buscas la entidad con un merge

		em.remove(em.merge(factura));
	}

	// metodo tiene ahora dos proxies
	// un proxy que gestiona la transaccionalidad
	// y otro que gestiona la seguridad
	@Transactional
	@Secured({"administrador","avanzado"})
	public void actualizar(Factura factura) {
		em.merge(factura);
	}
	
	@Transactional
	public Factura buscarUna(int numero) {
		return em.find(Factura.class, numero);
	}

}
