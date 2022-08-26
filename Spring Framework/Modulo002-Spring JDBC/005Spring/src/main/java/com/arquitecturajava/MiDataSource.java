package com.arquitecturajava;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

// singleton 
// es una clase que solo tiene un objeto en memoria
public class MiDataSource {

	private static MiDataSource miDataSource= new MiDataSource();
	private MysqlDataSource mySQLDataSource;
	// no podemos construir objetos de el
	private MiDataSource() {
		
		mySQLDataSource= new MysqlDataSource();
		mySQLDataSource.setUrl("jdbc:mysql://localhost/spring?serverTimezone=UTC");
		mySQLDataSource.setUser("root");
		mySQLDataSource.setPassword("");
			
	
	}
	// metodo publico
	// se generara un objeto y quedara en memoria
	public static MiDataSource getInstance() {
		
		if (miDataSource==null) {
			
			miDataSource= new MiDataSource();
		}
		return miDataSource;
	}
	
	public Connection getConnection() throws SQLException {
		
		return mySQLDataSource.getConnection();
	}
}
