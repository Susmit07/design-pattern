package com.sapient.immutables;

public class Address {
	
	private String streetName;
	private String town;

	public Address(String streetName, String town) {
		super();
		this.streetName = streetName;
		this.town = town;
	}

	public Address() {
	}

	public String getStreetName() {
		return streetName;
	}

	public String getTown() {
		return town;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setTown(String town) {
		this.town = town;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", town=" + town + "]";
	}
}
