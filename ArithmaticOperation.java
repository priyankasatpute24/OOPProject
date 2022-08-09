package com.java;
import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {
		ArithmaticOperation obj=new ArithmaticOperation();
		Scanner sc = new Scanner(System.in);
		System.out.println("********** ARITHMATIC CALCULATOR **********");
		int input1, input2, input;
		System.out.println("Enter first value:");
		input1 = sc.nextInt();
		System.out.println("Enter second value :");
		input2 = sc.nextInt();
		System.out.println("Enter a user choice :");
		input = sc.nextInt();
		int output=obj.performArithmaticOperation(input1,input2,input);
		if(output<0) {
			System.out.println("Invalid Input");
		}else {
			System.out.println("Output of desired operation is: "+output);

		}

	}

	public int performArithmaticOperation(int value1, int value2, int choice) {
		int result = 0;
		if((value1<0 && value2<0)||(value1>32767 && value2>32767)) {
			return -1;
		}else if(!(choice>=1&&choice<=4)) {
			return -1;
		}else {
		switch (choice) {
		case 1:
			result = value1 + value2;
			return result;
		case 2:
			result = value1 - value2;
			return result;

		case 3:
			result = value1 * value2;
			return result;

		case 4:
			result = value1 / value2;
			return result;

		}
		return result;

	}}

}
