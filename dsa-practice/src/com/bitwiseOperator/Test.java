package com.bitwiseOperator;

public class Test {

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		int sArray[] = new int[26];
		int tArray[] = new int[26];

		for (char c : s.toCharArray()) {
			sArray[c - 'a']++;
		}
		
		for(int i=0;i<sArray.length;i++) {
			System.out.print(sArray[i]+",");
		}
		
		for (char c : t.toCharArray()) {
			tArray[c - 'a']++;
		}
		System.out.println();
		for(int i=0;i<tArray.length;i++) {
			System.out.print(tArray[i]+",");
		}
		
		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (sArray[i] > tArray[i])
				count++;
			if (count != 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		int a = 2;
		int b = 3;

		System.out.println(a & b);
		int i = 1;

		System.out.println(2 << 3); // 0 0 0 0 0 0 0 1 -> 0 0 0 0 1 0 0 0
		System.out.println(8 >> 5); // 0 0 0 0 1 0 0 0 -> 0 0 0 0 0 0 0 1
		// 0010 -> 0010 , 0010 , 0011 = 4 %4 = 0011

		System.out.println((byte) 'b');
		String s = "anagram", t = "nagaram";
		isAnagram(s, t);

	}
}
