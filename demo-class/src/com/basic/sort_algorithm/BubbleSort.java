package com.basic.sort_algorithm;

public class BubbleSort {

	public static void bubbleSortAscending(int arr[]) {
		print(arr);

		for (int i = 0; i < arr.length; i++) { // is to run n number time
			boolean flag = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					flag = true;
				}
			}
			print(arr);
			if (!flag) {
				break;
			}
		}
	}

	public static void bubbleSortDescending(int arr[]) {
		print(arr);

		for (int i = 0; i < arr.length; i++) { // is to run n number time
			boolean flag = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] > arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					flag = true;
				}
			}
			print(arr);
			if (!flag) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 10, -1, -45, 7, 69, 0, 58, 3, 70, 25 };
		 bubbleSortAscending(arr);
		//bubbleSortDescending(arr);
		System.out.println("------------------------------------------------------------");
		print(arr);

	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" -> " + arr[i]);
		}
		System.out.println();
	}
}
