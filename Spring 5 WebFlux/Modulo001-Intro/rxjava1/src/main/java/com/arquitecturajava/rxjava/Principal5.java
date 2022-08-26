package com.arquitecturajava.rxjava;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;


public class Principal5 {

	public static void main(String[] args) {
		
		
		Observable<Long> lista=Observable.interval(1, TimeUnit.SECONDS);
		lista.subscribe(System.out::println);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
