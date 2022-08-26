package com.arquitecturajava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacturaRepository {

	public List<Factura> buscarTodas() throws SQLException, ClassNotFoundException {

		String sql = "select * from Facturas";
		List<Factura> lista= new ArrayList<Factura>();
		try (Connection connection = getConexion();
				PreparedStatement sentencia = connection.prepareStatement(sql);
				ResultSet rs = sentencia.executeQuery()) {
			while (rs.next()) {

				Factura f= new Factura();
				f.setNumero(Integer.parseInt(rs.getString("numero")));
				f.setConcepto(rs.getString("concepto"));
				f.setImporte(Double.parseDouble(rs.getString("importe")));
				lista.add(f);
			}
		} catch (SQLException e) {
			throw e;
		}
		return lista;

	}
	
	
	public void insertar(Factura factura) throws SQLException, ClassNotFoundException {
		// define la consulta SQL
		String sql = "insert into Facturas (numero,concepto, importe) values (?,?,?)";

		try (Connection connection = getConexion(); 
				PreparedStatement sentencia = connection.prepareStatement(sql)) {
			sentencia.setInt(1, factura.getNumero());
			sentencia.setString(2, factura.getConcepto());
			sentencia.setDouble(3, factura.getImporte());
			sentencia.execute();

		} catch (SQLException e) {
			throw e;
		}
	}
	
	private Connection getConexion() throws SQLException {
		
		Connection conexion = MiDataSource.getInstance().getConnection();
		return conexion;
	}

}
