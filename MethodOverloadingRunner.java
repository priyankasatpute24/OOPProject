package com.java;
public class MethodOverloadingRunner {
	public float sum(float d, int e) {
		return d+e;
	}

	public int sum(int i, int j, int k) {
		return i+j+k;

	}

	public static void main(String[] args) {
		MethodOverloadingRunner m1 = new MethodOverloadingRunner();
		System.out.println("Sum of two numbers is: " +m1.sum(12.5f, 20));
		System.out.println("Sum of three numbers is: " + m1.sum(20,30,40));

	}

}
