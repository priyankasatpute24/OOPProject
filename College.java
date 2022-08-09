package com.java;

class Department {
	int departmentNum;
	String departmentName;

	public void getDetails() {
		departmentNum = 3;
		departmentName = "Computer";
		System.out.println("Department Num: " + departmentNum + ", Department Name: " + departmentName);
	}
}

class Computer extends Department {
	String labName;

	public void getDetails1() {
		labName = "Computer Lab";
		System.out.println(
				"Department Num: " + departmentNum + ", Department Name: " + departmentName + ", Lab Name: " + labName);

	}
}

class Student extends Computer {
	public void getDetails2() {
		String studentName = "Amrutha";
		System.out.println("Department Num: " + departmentNum + ", Department Name: " + departmentName + ", Lab Name: "
				+ labName + ", Student Name: " + studentName);

	}
}

public class College {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.getDetails();
		s1.getDetails1();
		s1.getDetails2();

	}

}
