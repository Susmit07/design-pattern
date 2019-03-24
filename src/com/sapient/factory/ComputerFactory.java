package com.sapient.factory;

public class ComputerFactory {

	public static Computer getFactory(String type, String ram, String hdd, String cpu) {
		if("PC".equals(type))
			return new PC(ram, hdd, cpu);
		else if("Laptop".equals(type))
			return new PC(ram, hdd, cpu);
		else
			return null;
	}
}
