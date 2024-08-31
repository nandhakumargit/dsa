package com.basic.array;

public class RowArray {

	public static void main(String[] args) {
		int array[][] = new int[3][3];
		int count = 0;

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = count++;
			}
		}

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
		// value are stored in this way = 012345678
	}
}
