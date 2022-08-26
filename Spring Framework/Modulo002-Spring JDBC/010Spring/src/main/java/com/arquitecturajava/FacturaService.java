package com.arquitecturajava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FacturaService {

	@Autowired
	FacturaRepository repositorio;
	
	@Transactional
	public void insertarVarios(Factura f1,Factura f2) {
		
		
		repositorio.insertar(f1);
		repositorio.insertar(f2);
		
	}
}
