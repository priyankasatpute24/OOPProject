package com.java;
class Employee {
	int salary = 40000;
	int bonus = 10000;
	String name = "Ankita";

	public String employeeDetails() {
		return "Employee [salary=" + salary + ", bonus=" + bonus + ", name=" + name + "]";
	}

}

class Developer extends Employee {
	String city = "Mumbai";

	@Override
	public String employeeDetails() {
		return "Developer [city=" + city + ", salary=" + salary + ", bonus=" + bonus + ", name=" + name + "]";
	}

}

public class EmployeeRunner {

	public static void main(String[] args) {
		Developer d = new Developer();
		System.out.println("Employee details: " + d.employeeDetails());
		System.out.println("Employee's city : " + d.city);
	}

}

