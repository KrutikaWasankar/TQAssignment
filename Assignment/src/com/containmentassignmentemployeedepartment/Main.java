package com.containmentassignmentemployeedepartment;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee(12, "KRUTIKA", 42000f, new Department(4042, "computer"), new Mydate());
		System.out.println(e);

	}

}
