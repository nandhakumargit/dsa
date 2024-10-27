package com.basic.recrusion;

public class FibonaciSeries {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(generateFibonaci(i));
	}

	private static int generateFibonaci(int n) {

		if (n <= 1)
			return n;

		return generateFibonaci(n - 1) + generateFibonaci(n - 2);

	}

}
