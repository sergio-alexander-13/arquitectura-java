package com.arquitecturajava;

import com.arquitecturajava.comandos.ComandoEmail;
import com.arquitecturajava.comandos.ComandoFactura;
import com.arquitecturajava.comandos.ComandoGuardar;
import com.arquitecturajava.comandos.ComandoImprimir;
import com.arquitecturajava.comandos.CommandManager;
import com.arquitecturajava.dominio.Factura;

public class Principal12 {

	public static void main(String[] args) {
		
		
		ComandoFactura cf= new ComandoImprimir();
		ComandoFactura cf1= new ComandoEmail();
		ComandoFactura cf2= new ComandoGuardar();
		
		CommandManager manager= new CommandManager();
		manager.add(cf);
		manager.add(cf1);
		manager.add(cf2);
		manager.execute(new Factura(1,"ordenador",200));
		
		
		//cf2.execute(cf1.execute(cf.execute(new Factura(1,"ordenador",200))));
	}

}
