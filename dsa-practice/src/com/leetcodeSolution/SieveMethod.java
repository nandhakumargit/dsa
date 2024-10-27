package com.leetcodeSolution;

public class SieveMethod {

	static int count;

	public static void getPrimeNumber(int n) {

		boolean[] flag = new boolean[n + 1];

		/*
		 * for (int i = 0; i <= n; i++) { flag[i] = true; }
		 */

		for (int i = 2; i * i <= n; i++) {
			if (!flag[i]) {
				for (int j = i * i; j <= n; j += i) {
					count++;
					flag[j] = true;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (!flag[i]) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

	public static void main(String[] args) {
		getPrimeNumber(100);
		System.out.println(count);
	}
}
