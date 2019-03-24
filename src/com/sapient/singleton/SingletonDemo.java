package com.sapient.singleton;

public final class SingletonDemo {

	public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for your team:");
        //Constructor is private.We cannot use "new" here.
        //Captain c3 = new Captain();//error
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        System.out.println("Trying to make another captain for your team:");
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        if (singletonClass1 == singletonClass2)
        {
            System.out.println("captain1 and captain2 are same instance.");
        }
    }
	
	
}
