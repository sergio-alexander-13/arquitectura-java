package com.arquitecturajava.servicios;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		
		// crear un contexto para anotaciones
		AnnotationConfigApplicationContext contexto= new AnnotationConfigApplicationContext();
		// registrar los ficheros de anotaciones que son de configuracion con component scan
		contexto.register(SpringConfigurador.class);
		//refrescar el contexto
		contexto.refresh();
		
		//invocar el bean
		Servicio miservicio= contexto.getBean(Servicio.class);
		System.out.println(miservicio.mensaje());
		contexto.close();

	}

}
