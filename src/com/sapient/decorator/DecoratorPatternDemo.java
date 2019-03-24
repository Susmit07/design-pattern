package com.sapient.decorator;

public class DecoratorPatternDemo {

	public static void main(String[] args) {

		System.out.println("***Decorator pattern Demo***\n");
		ConcreteHouseComponent withoutDecorator = new ConcreteHouseComponent();
		withoutDecorator.makeHouse();
		System.out.println("_________________");
		//Using a decorator to add floor
		System.out.println("Using a Floor decorator now.");
		FloorDecorator floorDecorator = new FloorDecorator();
		floorDecorator.setConcreteHouseComponent(withoutDecorator);
		floorDecorator.makeHouse();
		System.out.println("_________________");
		//Using a decorator to add floor to original house and then
		//paint it.
		System.out.println("Using a Paint decorator now.");
		PaintDecorator paintDecorator = new PaintDecorator();
		//Adding results from floor decorator
		paintDecorator.setConcreteHouseComponent(floorDecorator);
		paintDecorator.makeHouse();
		System.out.println("_________________");

	}
}
