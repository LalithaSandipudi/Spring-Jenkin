package com.cg.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeService {

	List<Employee> list = EmployeeRepository.getEmployees();

	public Employee getEmployee(int id, String name) {
		//display the Employee details based on id or name
		Employee e1 = new Employee();
		
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getId() == id || list.get(i).getName()== name){
				e1 = (list.get(i));
			}		
		}
		
		return e1;
	}
	public List<Employee> getEmployees(Double salary) {
		// display the names of employees who are getting the salary greater than the
		// salary given
		List<Employee> l1 = new ArrayList<>();
		for(int i=0; i<list.size();i++){
			if(list.get(i).getSalary()>salary){
				l1.add(list.get(i));
			}
		}
		return l1;
	}

	public Double getMaxSalary() {
		// display the max salary
		Double maxSalary =0.0;
		for(int i=0; i<list.size();i++){
			if(list.get(i).getSalary()>maxSalary){
				maxSalary = list.get(i).getSalary();
			}
		}
		return maxSalary;
	}
	public Double getSumOfSalary() {
		// display the sum of salaries of all the employees
		Double sum =0.0;
		for(int i=0; i<list.size();i++){
			sum = sum+list.get(i).getSalary();
		}
		return sum;

	}
	public List<String> getNames(String city) {
		// display the names of all employees who are working in 'Pune'
		List<String> l1 = new ArrayList<>();
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getLocation()=="pune"){
				l1.add(list.get(i).getName());
			}
		}
		return l1;
	}

	public List<Employee> getDetails() {
		// display all employees based on salary ascending
		
		Collections.Sort(list);
		
		return list;
	}

	public List<Employee> getManagers() {
		// display all employees who are working as managers
		List<Employee> l1 = new ArrayList<>();
		for(int i=0; i<list.size();i++){
			if(list.get(i).getDesignation()=="Manager"){
				l1.add(list.get(i));
			}
		}
		return l1;
	}

	public Double getSumOfManagerSalaries() {
		// display the sum of salaries of employees who are working as managers
		Double sum = 0.0;
		for(int i=0; i<list.size();i++){
			if(list.get(i).getDesignation()=="Manager"){
				sum = sum+ list.get(i).getSalary();
			}
		}
		return sum;
	}

	public List<Integer> getIds() {
		// display the ids of all employees
		List<Integer> l1 = new ArrayList<Integer>();
		for(int i=0; i<list.size(); i++){
			l1.add(list.get(i).getId());
		}
		return l1;
	}
}

