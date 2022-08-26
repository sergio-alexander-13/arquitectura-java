package com.arquitecturajava.rxjava;

import io.reactivex.Observable;


public class Principal {

	public static void main(String[] args) {
		
		// tenemos un observable
		Observable<String> lista=Observable.just("hola","que","tal","estas");
		
		//nos acabamos de subscribir a el
		// eso nos procesa en el subscriptor cada uno de los elementos
		lista.subscribe(e->System.out.println(e));
	

	}

}
