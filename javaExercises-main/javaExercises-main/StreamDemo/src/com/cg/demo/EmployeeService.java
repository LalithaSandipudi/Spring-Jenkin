package com.cg.demo;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

	List<Employee> list = EmployeeRepository.getEmployees();

	public Employee getEmployee(int id, String name) {
		//display the Employee details based on id or name
		return list.stream().filter(emp->emp.getId()==id||emp.getName().equals(name)).collect(Collectors.toList()).get(0);
	}

	public List<Employee> getEmployees(Double salary) {
		// display the details of employees who are getting the salary greater than the
		// salary given
		List<Employee>empList=list.stream().filter(emp->emp.getSalary()>salary).collect(Collectors.toList());
		return empList;
	}

	public Double getMaxSalary() {
		// display the max salary
		Double maxsal=list.stream().map(emp->emp.getSalary()).max((e1,e2)->e1.compareTo(e2)).get();
		return maxsal;
	}

	public Double getSumOfSalary() {
		// display the sum of salaries of all the employees
		Double salsum=list.stream().mapToDouble(emp->emp.getSalary()).sum();
		return salsum;

	}

	public List<String> getNames(String city) {
		// display the names of all employees who are working in 'Pune'
		return list.stream().map(emp->emp.getLocation()).filter(str->str.equals("pune")).collect(Collectors.toList());
	}

	public List<Employee> getDetails() {
		// display all employees based on salary ascending
      List<Employee>emp=list.stream().sorted().toList();
		return emp;
	}

	public List<Employee> getManagers() {
		// display all employees who are working as managers
		List<Employee>emp=list.stream().filter(e->e.getDesignation().equals("Manager")).toList();
		return emp;
	}

	public Double getSumOfManagerSalaries() {
		// display the sum of salaries of employees who are working as managers
		List<Employee>emp=list.stream().filter(e->e.getDesignation().equals("Manager")).toList();
		Double sum=emp.stream().map(e->e.getSalary()).reduce((e1,e2)->e1+e2).get();
		
		return sum;
	}

	public List<Integer> getIds() {
		// display the ids of all employees
		List<Integer> emp=list.stream().map(e->e.getId()).toList();
		return emp;
	}
	public List<String> getManagerNames(){
		List<Employee>emp=list.stream().filter(e->e.getDesignation().equals("Manager")).toList();
		List<String>names=emp.stream().map(e->e.getName()).toList();
	//display names of employees who are managers
		return names;	
	}
	
}
