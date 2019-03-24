package com.sapient.immutables;

public class ImmutablesDemo {

	public static void main(String[] args) {
		
		Address address = new Address();
		address.setStreetName("CGR");
		address.setTown("TUN");
		Employee employee = new Employee("1", "Susmit", address);
		System.out.println(employee);
		//address.setStreetName("sus");
		employee.getAddress().setStreetName("GAN");
		System.out.println(employee);
	}
}
