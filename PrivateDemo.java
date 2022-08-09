package com.java;

public class PrivateDemo {
	private int Integer=10;
	char String='a';
	private void displayData() {
		System.out.println("Hello "+Integer+String);
	}
	public static void main(String[] args) {
		PrivateDemo a=new PrivateDemo();
				a.displayData();
	}

}
