package com.basic.sort_algorithm;

import java.util.Arrays;

public class CycleSort {

	public static void cycleSort(int arr[]) {

		int i = 0;

		while (i < arr.length) {
			int index = arr[i] - 1;
			if (arr[i] != arr[index]) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			} else {
				i++;
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("i = " + i);
		}

	}

	public static void main(String[] args) {
		int arr[] = { 3, 5, 4, 1, 2 }; // 1 to N
		cycleSort(arr);
	}
}
