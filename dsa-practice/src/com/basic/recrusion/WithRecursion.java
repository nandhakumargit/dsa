package com.basic.recrusion;

public class WithRecursion {

	// Its a direct call Recursion
	static void print(int n) {
		if (n == 5) // Base Condition.
			return;

		System.out.println("Given Number = " + n);
		print(++n);

	}

	// Its a in-direct call Recursion
	static void print1(int n) {
		if (n == 5)
			return;

		System.out.println("Given Number = " + n);
		print2(++n);

	}

	static void print2(int n) {
		print1(++n);
	}

	public static void main(String[] args) {

		print(1);

	}

}
