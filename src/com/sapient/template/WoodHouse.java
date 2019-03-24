package com.sapient.template;

public class WoodHouse extends HouseTemplate  {

	@Override
	public void buildWindows() {
		System.out.println("Build wood windows");
	}

	@Override
	public void buildWalls() {
		System.out.println("Build wood walls");
	}
}
