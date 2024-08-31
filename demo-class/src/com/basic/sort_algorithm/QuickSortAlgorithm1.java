package com.basic.sort_algorithm;

import java.util.Arrays;

public class QuickSortAlgorithm1 {

	public static void quickSort(int arr[], int start, int end) {

		if (start < end) {

			int left = start;
			int right = end - 1;
			int pivot = arr[end];

			while (left <= right) {
				while (left <= right && arr[left] < pivot)
					left++;
				while (right >= 0 && arr[right] > pivot)
					right--;

				if (left <= right) {
					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left++;
					right--;
				}
				System.out.println(Arrays.toString(arr));
			}

			System.out.println("----------------" + left + " " + right);
			arr[end] = arr[left];
			arr[left] = pivot;

			quickSort(arr, start, right - 1);
			quickSort(arr, right + 1, end);
		}

	}

	public static void quickSortPFirst(int arr[], int start, int end) {

		if (start < end) {

			int left = start + 1;
			int right = end;
			int pivot = arr[start];

			while (left <= right) {
				while (left < arr.length && arr[left] < pivot)
					left++;
				while (right >= 0 && arr[right] > pivot)
					right--;

				if (left <= right) {
					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left++;
					right--;
				}
				System.out.println(Arrays.toString(arr));
			}

			arr[start] = arr[right];
			arr[right] = pivot;

			quickSort(arr, start, right - 1);
			quickSort(arr, right + 1, end);
		}

	}

	public static void main(String[] args) {
		int arr[] = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
