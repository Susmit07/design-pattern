package com.sapient.builder.pattern;

public class ComputerBuilder {
	
	public String os;
	public String ram;
	public String processor;
	public int hdd;
	
	public ComputerBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public ComputerBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}
	public ComputerBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public ComputerBuilder setHdd(int hdd) {
		this.hdd = hdd;
		return this;
	}
	
	public Computer getComputerBuilder() {
		return new Computer(os, ram, processor, hdd);
	}
	

}
