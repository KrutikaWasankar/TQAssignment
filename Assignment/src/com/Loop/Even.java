//1.	 WAP to print even numbers from 121 to 229 using for loop. 
package com.Loop;

public class Even {

	public static void main(String[] args) {
		int n = 229;
		System.out.println("Even number are" + n + "are :");
		for (int i = 121; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "");

			}
		}
	}

}
