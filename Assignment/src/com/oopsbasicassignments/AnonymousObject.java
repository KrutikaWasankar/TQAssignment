package com.oopsbasicassignments;

public class AnonymousObject {

	// anonymous object means object crating without giving a name

	String pname;
	int age;

	void takeAndDisplay(String pn, int ag) {
		pname = pn;
		age = ag;
		System.out.println("person name=" + pname + " " + "age=" + age);
	}

	public static void main(String[] args) {
		new AnonymousObject().takeAndDisplay("Suraj", 35);
	}
}
