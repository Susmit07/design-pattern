package com.sapient.immutables;

public final class Employee {
	
	private final String empID;
	private final String name;
	private final Address address;
	
	public Employee(String empID, String name, Address address) {
		System.out.println("in constructor");
		this.empID = empID;
		this.name = name;
		this.address = new Address(address.getStreetName(), address.getTown());
	}
	
	public String getEmpID() {
		return empID;
	}
	
	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		return new Address(address.getStreetName(), address.getTown());
	}
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", address=" + address + "]";
	}

}