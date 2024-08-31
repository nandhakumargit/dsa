package com.basic.search_algorithm;

public class LinearSearch {

	public static void search(int[] arr, int findValue) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findValue) {
				System.out.println("Element Found at index = " + i + " value = " + arr[i]);
				return;
			}
		}
		System.out.println("Element Not Found ");
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 4, 9, 7, 6, 3, 2, 10, 5 };
		search(arr, 4);
	}
}
