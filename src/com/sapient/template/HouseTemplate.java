package com.sapient.template;

public abstract class HouseTemplate {

	// make it final so sub class cannot modify it by overriding
	public final void buildHouse() {
		buildBasics();
		buildDoors();
		buildWalls();
		buildWindows();
		System.out.println("House Done");
	}

	public abstract void buildWindows();

	public abstract void buildWalls();

	private void buildDoors() {
		System.out.println("Doors built!!");
	}

	private void buildBasics() {
		System.out.println("House Starts");
	}
}
