package com.sapient.abst.factory;

public class ComputerFactory {

	public static Computer getComputer
	(ComputerAbstractFactory computerAbstractFactory){
		return computerAbstractFactory.createComputer(); 
	}
}
