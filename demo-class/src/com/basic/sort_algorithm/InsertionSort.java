package com.basic.sort_algorithm;

import java.util.Arrays;

public class InsertionSort {

	private static void insertionSortAsc(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}

	}

	private static void insertionSortDesc(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] > arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				} else {
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 10, -1, -45, 7, 69, 0, 58, 3, 70, 25 };
		System.out.println("--------------------------------------");
		System.out.println(Arrays.toString(arr));
		// selectionSortAsc(arr);
		insertionSortDesc(arr);
		System.out.println(Arrays.toString(arr));
	}

}
