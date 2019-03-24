package com.sapient.decorator;

//abstract because we don't want to instantiate this class
public abstract class AbstractDecoratorHouse extends ConcreteHouseComponent{

	private HouseComponent houseComponent;

	public void setConcreteHouseComponent(HouseComponent houseComponent) {
		this.houseComponent = houseComponent;
	}

	public void makeHouse(){
		if (houseComponent != null){
			houseComponent.makeHouse();//Delegating the task
		}
	}
}
