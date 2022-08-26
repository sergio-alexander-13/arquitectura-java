package com.arquitecturajava.rxjava;

import io.reactivex.Observable;


public class Principal4 {

	public static void main(String[] args) {
		
		
		Observable<String> lista=Observable.just("hola","que","tal","estas");
		
		//operacion de transformacion
		lista.map(String::toUpperCase).subscribe(e->System.out.println(e));
	

	}

}
