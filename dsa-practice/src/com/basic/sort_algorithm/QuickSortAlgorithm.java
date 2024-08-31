package com.basic.sort_algorithm;

import java.util.Arrays;

public class QuickSortAlgorithm {

	public static void quickSort(int arr[], int start, int end) {

		if (start < end) {

			int l = start;
			int r = end;
			int mid = start + (end - start) / 2;
			int pivot = arr[mid];

			while (l <= r) {

				while (arr[l] < pivot) {
					l++;
				}
				while (arr[r] > pivot) {
					r--;
				}

				if (l <= r) {
					int temp = arr[l];
					arr[l] = arr[r];
					arr[r] = temp;
					l++;
					r--;
				}
			}
			quickSort(arr, start, r);
			quickSort(arr, l, end);
		}

	}

	public static void main(String[] args) {
		int arr[] = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
