package com.bitwiseOperator;

public class ArrayTest {

	public static int singleNumber(int[] nums) {
		// Initialize variables to keep track of bits
		int ones = 0, twos = 0;
		for (int num : nums) {
			System.out.println("----------------------");
			// Update `ones` to keep bits that have appeared exactly once
			ones = (ones ^ num) & ~twos;
			System.out.println(ones);
			// Update `twos` to keep bits that have appeared exactly twice

			System.out.println(~ones);
			twos = (twos ^ num) & ~ones;
			System.out.println(twos);
		}
		return ones; // The number that appears once will be stored in `ones`
	}

	public static void main(String[] args) {
		int[] arr = {  2, 2,5,7,7 };

		singleNumber(arr);
	}
}
