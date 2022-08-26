package com.arquitecturajava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class FacturaRepository {
	@Autowired
	private JdbcTemplate plantilla;
	
	public List<Factura> buscarTodas() throws SQLException, ClassNotFoundException {

		String sql = "select * from Facturas";
		return plantilla.query(sql, new FacturaRowMapper());

	}
	
	
	public void insertar(Factura factura) throws SQLException, ClassNotFoundException {
		String sql = "insert into Facturas (numero,concepto, importe) values (?,?,?)";
		plantilla.update(sql,factura.getNumero(),factura.getConcepto(),factura.getImporte());
	}
	

}
