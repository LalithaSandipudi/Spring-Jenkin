package com.cg.demo;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();
		
		//call the functions
		System.out.println(service.getEmployee(123090, "prithvi"));
		System.out.println(service.getEmployees(6000.0));
		System.out.println("Max salary : "+service.getMaxSalary());
		System.out.println("sumofsalary : "+service.getSumOfSalary());
		System.out.println("employees as managers : "+service.getManagers());
		System.out.println(service.getSumOfManagerSalaries());
		System.out.println(service.getIds());
		System.out.println(service.getManagerNames());
		
	}

}
