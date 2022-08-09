package com.java;
public class EncapsulationOperation {

	public static void main(String[] args) {
		Learner l=new Learner();
		l.setRollNum(121);
		l.setName("Ankita");
		l.setCity("Pune");
		System.out.println("Learner's rollNo.is: "+l.getRollNum());
		System.out.println("Learner's name is: "+l.getName());
		System.out.println("Learner's city is: "+l.getCity());
}

}
