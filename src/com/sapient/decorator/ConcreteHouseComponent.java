package com.sapient.decorator;

public class ConcreteHouseComponent extends HouseComponent{

	@Override
	public void makeHouse() {
		System.out.println("House create now only add modifications");
	}

}
