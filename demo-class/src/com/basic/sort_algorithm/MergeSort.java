package com.basic.sort_algorithm;

import java.util.Arrays;

public class MergeSort {

	public static int[] mergeSort(int arr[]) {

		if (arr.length == 1) {
			return arr;
		}

		int mid = arr.length / 2;

		int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

		return mergeArray(left, right);
	}

	private static int[] mergeArray(int[] left, int[] right) {

		int result[] = new int[left.length + right.length];

		int l = 0;
		int r = 0;
		int n = 0;

		while (l < left.length && r < right.length) {
			if (left[l] < right[r]) {
				result[n] = left[l];
				l++;
			} else {
				result[n] = right[r];
				r++;
			}
			n++;
		}

		while (l < left.length) {
			result[n] = left[l];
			l++;
			n++;
		}

		while (r < right.length) {
			result[n] = right[r];
			r++;
			n++;
		}

		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 4, 7, 1, 3, 2, 6, 8 };
		System.out.println(Arrays.toString(arr));
		int result[] = mergeSort(arr);
		System.out.println(Arrays.toString(result));
	}

}
