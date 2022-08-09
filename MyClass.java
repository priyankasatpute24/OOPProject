package com.java;
class ConsDemo {
	int x;

	public ConsDemo() {
		x = 10;
		System.out.println("Value of x is: " + x);
	}

	public ConsDemo(int x) {
		this.x = x;
		System.out.println("Value of x is: " + x);

	}

}

public class MyClass {

	public static void main(String[] args) {
		ConsDemo c = new ConsDemo();
		ConsDemo c1 = new ConsDemo(123);
		ConsDemo c2 = new ConsDemo(34);

	}

}
