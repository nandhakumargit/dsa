package com.basic.search_algorithm;

public class BinarySearch {

	public static int search(int[] arr, int findValue) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			// 0+9=9/2= 4 -> 4+9=13/2=6 --> 2147
			// 2147483647 = > 0+2147483647 / 2
			// 0+(4)=4->
			int mid = start + (end - start) / 2;
			if (findValue > arr[mid]) {
				start = mid + 1;
			} else if (findValue < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		System.out.println("Element Not Fount ");
		return -1;
	}

	public static int anyOrderSearch(int[] arr, int findValue) {

		int start = 0;
		int end = arr.length - 1;

		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == findValue)
				return mid;

			if (isAsc) {
				if (findValue > arr[mid]) {
					start = mid + 1;
				} else if (findValue < arr[mid]) {
					end = mid - 1;
				}
			} else {
				if (findValue > arr[mid]) {
					end = mid - 1;
				} else if (findValue < arr[mid]) {
					start = mid + 1;
				}
			}
		}
		System.out.println("Element Not Fount ");
		return -1;
	}

	public static int anyOrderSearchRegresion(int[] arr, int findValue, int start, int end) {

		int mid = start + (end - start) / 2;

		if (start <= end) {

			boolean isAsc = arr[start] < arr[end];

			if (arr[mid] == findValue) {
				return mid;
			}

			if (isAsc) {
				if (findValue > arr[mid]) {
					start = mid + 1;
				} else if (findValue < arr[mid]) {
					end = mid - 1;
				}
			} else {
				if (findValue > arr[mid]) {
					end = mid - 1;
				} else if (findValue < arr[mid]) {
					start = mid + 1;
				}
			}

			return anyOrderSearchRegresion(arr, findValue, start, end);
		}
		return -123;
	}

	public static void main(String[] args) throws InterruptedException {
		int[] arr = { 1, 1, 5, 6, 7, 8, 9, 32, 45, 82, 160 };
		int[] arr1 = { 100, 95, 85, 84, 77, 68, 59, 45, 38, 16 };
//		System.out.println(search(arr, 82));
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(anyOrderSearch(arr, 5));

		System.out.println(anyOrderSearchRegresion(arr1, 38, 0, arr1.length - 1));

	}
}
