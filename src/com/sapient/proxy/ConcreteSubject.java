package com.sapient.proxy;

public class ConcreteSubject extends Subject{

	@Override
	public void doSomeWork() {
		System.out.println("doSomeWork() inside ConcreteSubject is invoked.");
	}
}
