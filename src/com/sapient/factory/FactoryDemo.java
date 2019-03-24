package com.sapient.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory
				.getFactory("PC", "1", "512", "Celleron");
		System.out.println(pc);
	}
}
