//WAP to show the use of break statement ( in for loop)

package com.Loop;

public class Break {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
				// continue;
			}
			System.out.println(i);
		}

	}

}
