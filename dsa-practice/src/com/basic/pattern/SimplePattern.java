package com.basic.pattern;

public class SimplePattern {

	public static void main(String[] args) {
		System.out.println("PATTERN - 1");
		System.out.println("---------------");
		pattern1();
		System.out.println("------------------------------------");
		System.out.println("PATTERN - 2");
		System.out.println("---------------");
		pattern2();
		System.out.println("------------------------------------");
		System.out.println("PATTERN - 3");
		System.out.println("---------------");
		pattern3();

		System.out.println("------------------------------------");
		System.out.println("PATTERN - 4");
		System.out.println("---------------");
		pattern4();

		System.out.println("------------------------------------");
		System.out.println("PATTERN - 5");
		System.out.println("---------------");
		pattern5();

		System.out.println("------------------------------------");
		System.out.println("PATTERN - 6");
		System.out.println("---------------");
		pattern6();

		System.out.println("------------------------------------");
		System.out.println("PATTERN - 7");
		System.out.println("---------------");
		pattern7();
	}

	public static void pattern1() {
		int n = 5; // number of rows
		// Outer loop for each row
		for (int i = 1; i <= n; i++) {
			// Inner loop for printing stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}

	public static void pattern2() {
		int n = 5; // number of rows
		// Outer loop for each row
		for (int i = 1; i <= n; i++) {
			// Inner loop for printing stars
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}

	public static void pattern3() {
		int n = 5; // number of rows
		// Outer loop for each row
		for (int i = 1; i <= n; i++) {
			// Inner loop for printing stars
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}

	public static void pattern4() {
		int n = 5; // number of rows
		// Outer loop for each row
		for (int i = 1; i <= n; i++) {
			// Inner loop for printing stars
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}

	public static void pattern5() {
		int n = 5; // number of rows
		// Outer loop for each row
		for (int i = 0; i < n; i++) {
			// Inner loop for printing stars
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}

	public static void pattern6() {
		int n = 5; // number of rows
		// Outer loop for each row
		for (int i = 0; i < n; i++) {
			// Inner loop for printing stars
			for (int j = 5; j > i; j--) {
				System.out.print(j + " ");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}

	public static void pattern7() {
		int n = 5; // number of rows
		// Outer loop for each row
		for (int i = 0; i < 2 * n; i++) {
			int totalCol = i > n ? (2 * n) - i : i;
			// Inner loop for printing stars
			for (int j = 0; j < totalCol; j++) {
				System.out.print(j + 1 + " ");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}

}
