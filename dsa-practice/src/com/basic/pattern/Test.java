package com.basic.pattern;

public class Test {
	public static void main(String[] args) {
		print();
		System.out.println("------------------");
		System.out.println("PATTREN-2");
		System.out.println("------------------");
		pattern2();
	}

	public static void print() {
		int n = 4;
		int row = n * 2;

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < row; j++) {
				int num = n - Math.min(Math.min(i, j), Math.min(row - i, row - j));
				System.out.print(num + 1 + " ");
			}

			System.out.println();
		}

	}

	public static void pattern2() {
		int n = 5;
		int row = n * 2;

		for (int i = 1; i < row; i++) {
			int totalCol = i > n ? row - i : i;

			for (int j = 0; j <= (n - totalCol); j++) {
				System.out.print("*");
			}

			for (int j = 1; j < totalCol; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < totalCol; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= (n - totalCol); j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
