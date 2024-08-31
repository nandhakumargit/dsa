package com.basic.array;

public class ColArray {

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
		System.out.println("----------------------");

		int temp[][] = new int[3][3];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				temp[col][row] = array[row][col];
			}
		}

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(temp[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		System.out.println(temp[0][1]);
		System.out.println(array[0][1]);

		// value are stored in this way = 036 147 258
	}

}
