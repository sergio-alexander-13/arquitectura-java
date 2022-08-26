package com.arquitecturajava.rxjava;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import com.arquitecturajava.rxjava.observers.MiObserver;

import io.reactivex.Observable;


public class Principal3 {

	public static void main(String[] args) {
		
		// tenemos un observable
		Observable<String> lista=Observable.just("hola","que","tal","estas");
		
		//nos acabamos de subscribir a el
		// eso nos procesa en el subscriptor cada uno de los elementos
		lista.subscribe(new MiObserver());
		System.out.println("*************");
		lista.subscribe(new MiObserver());
		
		
	

	}

}
