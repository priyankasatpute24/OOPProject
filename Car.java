package com.java;
class Brand{
	String brand;
	int modalYear;

	public Brand() {
		brand="Ford";
	}
	public Brand(int year) {
		modalYear= year;
	}

	public String getBrand() {
		return brand;
	}

	public int getModalYear() {
		return modalYear;
	}
	
}
public class Car {

	public static void main(String[] args) {
		Brand b=new Brand();
		Brand b1=new Brand(2022);
		String str=b.getBrand();
		System.out.println("Car brand name is: "+str);
		int year=b1.getModalYear();
		System.out.println("Modal year is: "+year);

	}

}
