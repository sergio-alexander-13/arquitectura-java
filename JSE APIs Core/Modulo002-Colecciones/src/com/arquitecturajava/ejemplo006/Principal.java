package com.arquitecturajava.ejemplo006;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
	
		
		Map<String,String> diccionario= new HashMap<String,String>();
		
		diccionario.put("nombre","Cecilio");
		diccionario.put("apellidos", "alvarez");
		diccionario.put("ciudad", "santander");
		
		System.out.println(diccionario.get("nombre"));
		
		Persona p1= new Persona("pepe","perez","madrid");
		Persona p2= new Persona("ana","gomez","barcelona");
		Persona p3= new Persona("juan","sanchez","bilbao");
		
		Map<String,Persona> diccionarioPersona= new HashMap<String,Persona>();
		
		diccionarioPersona.put("pepe", p1);
		diccionarioPersona.put("ana", p2);
		diccionarioPersona.put("juan", p3);
		
		
		Persona p4= diccionarioPersona.get("pepe");
		
		System.out.println(p4.getApellidos());
	
		Set<String> claves=diccionarioPersona.keySet();
		
		for(String clave:claves) {
			
			System.out.println(diccionarioPersona.get(clave).getApellidos());
		}
		
		
	}

}
