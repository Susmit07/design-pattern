package com.sapient.builder.pattern;

public class Computer {
	
	public String os;
	public String ram;
	public String processor;
	public int hdd;
	
	public Computer(String os, String ram, String processor, int hdd) {
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.hdd = hdd;
	}

	@Override
	public String toString() {
		return "Computer [os=" + os + ", ram=" + ram + ", processor=" + processor + ", hdd=" + hdd + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
