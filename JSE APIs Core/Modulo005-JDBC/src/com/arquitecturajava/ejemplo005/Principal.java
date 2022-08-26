package com.arquitecturajava.ejemplo005;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {

		String cadenaConexion = "jdbc:mysql://localhost:3306/curso";
		try (Connection conexion = DriverManager.getConnection(cadenaConexion, "root", "");
				Statement sentencia = conexion.createStatement();) {
		
		//autocommit a false	
		//conexion.setAutoCommit(false);
		
		//a partir de ahora se ejecuta de forma transaccional es decir si no se acepta a pepe el resto
		// de insert no se añadiran a la base de datos
		sentencia.executeUpdate("insert into persona (nombre,apellidos,edad) values ('pepe6','perez',20)");
		sentencia.executeUpdate("insert into persona (nombre,apellidos,edad) values ('pepe7','perez',20)");
		sentencia.executeUpdate("insert into persona (nombre,apellidos,edad) values ('pepe','perez',20)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
