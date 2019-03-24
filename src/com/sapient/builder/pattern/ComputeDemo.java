package com.sapient.builder.pattern;

public class ComputeDemo {

	public static void main(String[] args) {

		Computer computerBuilder = new ComputerBuilder().setHdd(1).getComputerBuilder(); 
		System.out.println(computerBuilder);
	}
}
