package com.arquitecturajava.rxjava.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MiObserver implements Observer {

	@Override
	public void onSubscribe(Disposable d) {
		
		
		System.out.println("nos hemos subscrito");
		
	}

	@Override
	public void onNext(Object elemento) {
		
		System.out.println(elemento);
		
	}

	@Override
	public void onError(Throwable e) {
		
		System.out.println("ha ocurrido un error");
		
	}

	@Override
	public void onComplete() {
		
		System.out.println("hemos finalizado");
		
	}

}
