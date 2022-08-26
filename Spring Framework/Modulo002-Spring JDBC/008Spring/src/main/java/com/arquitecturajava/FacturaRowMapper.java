package com.arquitecturajava;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


// esto es lo que hace jdbc convierte filas de base de datos
// a objetos Java 
public class FacturaRowMapper implements RowMapper<Factura>{

	@Override
	public Factura mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Factura (rs.getInt("numero"),rs.getString("concepto"),rs.getDouble("importe"));
		
	}

}
