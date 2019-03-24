package com.sapient.prototype;

import java.util.List;

public class EmployeePrototypeDemo {

	public static void main(String[] args) {
		EmployeePrototype emps = new EmployeePrototype();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		EmployeePrototype empsNew = (EmployeePrototype) emps.clone();
		EmployeePrototype empsNew1 = (EmployeePrototype) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Akash");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}
}
