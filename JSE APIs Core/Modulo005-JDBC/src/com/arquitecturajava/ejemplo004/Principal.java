package com.arquitecturajava.ejemplo004;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {

		String cadenaConexion = "jdbc:mysql://localhost:3306/curso";
		try (Connection conexion = DriverManager.getConnection(cadenaConexion, "root", "");
			 CallableStatement sentencia = conexion.prepareCall("{CALL seleccionarPersonas()}");
			ResultSet rs= sentencia.executeQuery();	
				
				) {
		
				while (rs.next()) {
					
					System.out.println(rs.getString("nombre"));
					System.out.println(rs.getString("apellidos"));
					System.out.println(rs.getString("edad"));
				}
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
