package com.techlabs.assignment_1;

public class Demo {
	public static void main(String args[]) {
		int i;
		System.out.println("Even numbers...");
		for (i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println("\n");
		System.out.println("Odd numbers...");
		for (i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ",");

			}
		}

	}

}