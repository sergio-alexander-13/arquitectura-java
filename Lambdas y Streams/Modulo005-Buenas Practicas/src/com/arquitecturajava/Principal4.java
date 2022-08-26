package com.arquitecturajava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.arquitecturajava.dominio.Factura;

public class Principal4 {

	public static void main(String[] args) {
		
		List<Factura> lista= new ArrayList<Factura>();
		Factura f;
		
		for (int i=0;i<10;i++) {
			
			f= new Factura(i,"concepto"+i, Math.round(Math.random()*10000));
			lista.add(f);
		}
		
		long t1=System.currentTimeMillis();
		Optional<Double> total= lista.parallelStream().map(Factura::getImporte).map(Principal4::duplicar).reduce(Double::sum);
		if(total.isPresent())
		System.out.println(total.get());
		
		long t2= System.currentTimeMillis();
		
		System.out.println(t2-t1);
	}

	
	// esta bloqueando el thread principal
	public static double duplicar(double numero) {
		
		
		// estamos relentizando el programa
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numero*2;
	}
}
