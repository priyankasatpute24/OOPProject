package com.java;


import java.util.Scanner;

class Student {
	int rollNo;
	String name;
	String city;

	public Student() {
		rollNo = 101;
		name = "Ravina";
		city = "Pune";
	}

	public Student(String name, int rollNo, String city) {
		this.name = name;
		this.rollNo = rollNo;
		this.city = city;
	}

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public void printDetails() {
		System.out.println("Name,rollNo and city of student is: ");
		System.out.printf("Name:" + name + ", RollNo:" + rollNo + ", City:" + city);
	}

}

public class StudentRunner {

	public static void main(String[] args) {
		//constructor overloading
		Scanner sc=new Scanner(System.in);
		Student s = new Student();
		s.printDetails();
		System.out.println("\nEnter RollNum, Name and City: ");
		String name=sc.nextLine();
		int rollNum=sc.nextInt();
//		String city=sc.nextLine();
//		Student s1 = new Student(name,rollNum, city);
//		s1.printDetails();
		Student s2 = new Student(name,rollNum);
		s2.printDetails();
	}

}
