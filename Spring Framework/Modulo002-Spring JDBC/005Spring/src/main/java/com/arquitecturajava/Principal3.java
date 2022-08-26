package com.arquitecturajava;

import java.sql.SQLException;
import java.util.List;

public class Principal3 {

	public static void main(String[] args) {
		
		try {
			FacturaRepository fr= new FacturaRepository();
			List<Factura> lista= fr.buscarTodas();
			
			for (Factura f: lista) {
				
				System.out.println(f.getNumero());
				System.out.println(f.getConcepto());
				System.out.println(f.getImporte());
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
