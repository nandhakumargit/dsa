package com.bitwiseOperator;

import java.util.HashMap;
import java.util.Map;

public class BitwiseOper {

	public static int singleNumber(int[] nums) {
		int x = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else
				map.put(nums[i], 0);
		}
		System.out.println(map);

		for (Map.Entry<Integer, Integer> val : map.entrySet()) {
			if (val.getValue() == 0)
				x = val.getKey();
		}
		return x;
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 7;

		System.out.print("AND Operator = ");
		System.out.println(a & b);

		System.out.print("OR Operator = ");
		System.out.println(a | b);

		System.out.print("XOR Operator = ");
		System.out.println(a ^ b);

		System.out.print("Complement ~ = ");
		System.out.println(~a);

		System.out.println(singleNumber(new int[] { 2, 2, 1 }));

		int x = 6;
		if ((x & 1) == 1)
			System.out.println("ODD");
		else
			System.out.println("EVEN");
	}
}
