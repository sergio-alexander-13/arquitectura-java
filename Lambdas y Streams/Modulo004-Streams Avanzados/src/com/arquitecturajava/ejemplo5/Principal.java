package com.arquitecturajava.ejemplo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.arquitecturajava.dominio.Deporte;
import com.arquitecturajava.dominio.Persona;

public class Principal {

	public static void main(String[] args) {

		List<Persona> lista= new ArrayList<Persona>();
		
		Persona p1= new Persona ("juan","gomez",20);
		p1.addDeporte(new Deporte("padel",30));
		p1.addDeporte(new Deporte("natacion",10));
		
		Persona p2= new Persona ("ana","blanco",20);
		p2.addDeporte(new Deporte("futbol",20));
		p2.addDeporte(new Deporte("tenis",8));
		
		
		Persona p3= new Persona ("pedro","marquez",40);
		p3.addDeporte(new Deporte("pesas",20));
		p3.addDeporte(new Deporte("ciclismo",10));
		
		Persona p4= new Persona ("maria","sanchez",30);
		p4.addDeporte(new Deporte("ciclismo",20));
		p4.addDeporte(new Deporte("padel",8));
		
		
		
		Persona p5= new Persona ("gabriel","marquez",50);
		p3.addDeporte(new Deporte("yoga",15));
		p3.addDeporte(new Deporte("ciclismo",10));
		
		Persona p6= new Persona ("maria","sanchez",35);
		p4.addDeporte(new Deporte("ciclismo",20));
		p4.addDeporte(new Deporte("padel",8));
		
		
		
		Persona p7= new Persona ("gabriel","perez",50);
		p7.addDeporte(new Deporte("yoga",15));
		p7.addDeporte(new Deporte("ciclismo",10));
		
		lista= Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		List<Persona> nueva=lista.stream().filter(p->p.getEdad()>30).collect(Collectors.toList());
		
		//Set<Persona> nueva=lista.stream().filter(p->p.getEdad()>30).collect(Collectors.toSet());
		
		for (Persona persona:nueva) {
			
			System.out.println(persona.getNombre());
		}
		
		
		
	
		
		
	}

}
