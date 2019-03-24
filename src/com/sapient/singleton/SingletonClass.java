package com.sapient.singleton;

public final class SingletonClass {

	private static volatile SingletonClass singletonInstance;
	private static Object mutex = new Object();


	private static int numberOfInstance=0;

	private SingletonClass() {
		numberOfInstance++;
		System.out.println("First time instance creation with instance : "+numberOfInstance);
	}


	public static SingletonClass getInstance() {
		if(singletonInstance == null) {
			synchronized (mutex) {
				if(singletonInstance == null) {
					singletonInstance = new SingletonClass();
				}
			}
		}
		return singletonInstance;
	}
}
