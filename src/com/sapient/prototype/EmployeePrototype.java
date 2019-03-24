package com.sapient.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeePrototype implements Cloneable{

	private List<String> empList;

	public List<String> getEmpList() {
		return empList;
	}

	public EmployeePrototype() {
		empList = new ArrayList<String>();
	}

	public EmployeePrototype(List<String> tempEmployeeList) {
		this.empList = tempEmployeeList;

	}

	public void loadData() {
		empList.add("Susmit");
		empList.add("Akash");
		empList.add("Sanu");
	}

	// Deep Copy
	@Override
	public Object clone() {
		List<String> tempEmployeeList = new ArrayList<String>();
		this.getEmpList().stream().forEach(tempEmployeeList::add);
		return new EmployeePrototype(tempEmployeeList);
	}

}
