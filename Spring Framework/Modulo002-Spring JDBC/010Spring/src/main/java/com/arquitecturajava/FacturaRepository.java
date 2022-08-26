package com.arquitecturajava;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class FacturaRepository {
	@Autowired
	private JdbcTemplate plantilla;
	
	public List<Factura> buscarTodas() {

		String sql = "select * from Facturas";
		return plantilla.query(sql, new BeanPropertyRowMapper<Factura>(Factura.class));

	}
	
	@Transactional
	public void insertar(Factura factura) {
		String sql = "insert into Facturas (numero,concepto, importe) values (?,?,?)";
		plantilla.update(sql,factura.getNumero(),factura.getConcepto(),factura.getImporte());
	}
	@Transactional
	public void borrar(Factura factura)  {

		String sql = "delete from Facturas where numero=?";

		plantilla.update(sql, factura.getNumero());
	}
	@Transactional
	public void actualizar(Factura factura)  {

		String sql = "update  Facturas set concepto=? , importe=? where numero=?";
 
		plantilla.update(sql, factura.getConcepto(),factura.getImporte(),factura.getNumero());
	}
	

}
