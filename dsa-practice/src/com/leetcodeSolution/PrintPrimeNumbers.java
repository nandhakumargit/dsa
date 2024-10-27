package com.leetcodeSolution;

import java.util.ArrayList;

public class PrintPrimeNumbers {

	static int count = 0;

	static boolean getPrimeNumber(int num) {

		if (num == 1 || num == 0)
			return false;

		for (int i = 2; i <= num/2; i++) {// 10 
			count++;
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int n = 100;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			if (getPrimeNumber(i))
				list.add(i);
		}

		System.out.println(list);
		System.out.println(count);
	}
}
