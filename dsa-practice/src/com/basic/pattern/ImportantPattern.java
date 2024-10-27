package com.basic.pattern;

public class ImportantPattern {

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

	}

	public static void pattern1() {
		int n = 5; // number of rows
		// Outer loop for each row
		for (int i = 1; i <= n; i++) {

			// This loop is for Space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// Inner loop for printing stars
			for (int j = i; j > 0; j--) {
				System.out.print(j % 2);
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
			for (int j = i; j > 0; j--) {
				System.out.print(j % 2);
			}
			// Move to the next line after each row
			System.out.println();
		}
	}

	public static void pattern3() {
		int n = 5; // number of rows
		// Outer loop for each row
		for (int i = 1; i < 2 * n; i++) {

			int totalCol = i > n ? (2 * n) - i : i;

			// Inner loop for printing stars
			System.out.print("*");
			for (int k = 1; k < totalCol - 1; k++) {
				System.out.print(" ");
			}
			if (totalCol > 1)
				System.out.print("*");

			// This loop is for Space
			for (int j = 0; j < (n - totalCol) * 2; j++) {
				System.out.print(" ");
			}

			System.out.print("*");
			for (int k = 1; k < totalCol - 1; k++) {
				System.out.print(" ");
			}
			if (totalCol > 1)
				System.out.print("*");

			System.out.println();
		}
	}

	public static void pattern4() {
		int n = 5; // number of rows
		n = n * 2;
		// Outer loop for each row
		for (int i = 1; i < n; i++) {

			// This loop is for Space
			for (int j = 0; j < n; j++) {
				int num = Math.min(i, j);
				System.out.print(num + " ");
			}

			System.out.println();
		}
	}

	public static void pattern5() {
		int n = 4; // number of rows
		int nl = n * 2;
		// Outer loop for each row
		for (int i = 1; i < nl; i++) {
			// Inner loop for printing stars
			for (int j = 1; j < nl; j++) {
				int num = n - Math.min(Math.min(i, j), Math.min(nl - i, nl - j));
				System.out.print(num + 1 + " ");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}

	public static void pattern6() {
		int n = 5; // number of rows
		// Outer loop for each row
		for (int i = 0; i <= n; i++) {
			// This loop is for Space
			for (int j = 0; j < (n - i) * 2; j++) {
				System.out.print(" ");
			}
			// Inner loop for printing stars
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}

}
