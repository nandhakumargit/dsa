package com.basic.sort_algorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSortAsc(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int maxValue = arr[0];
			int lastIndex = arr.length - 1 - i;
			int maxIndex = 0;
			for (int j = 1; j <= lastIndex; j++) {
				if (maxValue < arr[j]) {
					maxValue = arr[j];
					maxIndex = j;
				}
			}

			int temp = arr[maxIndex];
			arr[maxIndex] = arr[lastIndex];
			arr[lastIndex] = temp;

		}

	}

	public static void selectionSortDesc(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int maxValue = arr[0];
			int lastIndex = arr.length - 1 - i;
			int maxIndex = 0;
			for (int j = 1; j <= lastIndex; j++) {
				if (maxValue > arr[j]) {
					maxValue = arr[j];
					maxIndex = j;
				}
			}

			int temp = arr[maxIndex];
			arr[maxIndex] = arr[lastIndex];
			arr[lastIndex] = temp;

		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 10, -1, -45, 7, 69, 0, 58, 3, 70, 25 };
		System.out.println(Arrays.toString(arr));
		// selectionSortAsc(arr);
		selectionSortDesc(arr);
		System.out.println(Arrays.toString(arr));
	}
}
