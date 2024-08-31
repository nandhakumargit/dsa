package com.basic.array;

public class JaggedArray2 {
	public static void main(String[] args) {
		int array[][] = new int[4][];
		array[0] = new int[3];
		array[1] = new int[3];
		array[2] = new int[2];
		array[3] = new int[5];
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

		System.out.println("--------------------");
		int maxCol = 0;

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if (maxCol < array[row].length)
					maxCol = array[row].length;
			}
		}

		int temp[][] = new int[maxCol][];

		for (int row = 0; row < maxCol; row++) { // Max 5 rows
			int findCol = 0;
			for (int col = 0; col < array.length; col++) { // max 4 col
				if (array[col].length > row) {
					findCol++;
				}
			}
			temp[row] = new int[findCol];
			int index = 0;
			// copy value
			for (int col = 0; col < array.length; col++) { // max 4 col
				if (array[col].length > row) {
					temp[row][index++] = array[col][row];
				}
			}

		}

		for (int row = 0; row < temp.length; row++) {
			for (int col = 0; col < temp[row].length; col++) {
				System.out.print(temp[row][col] + " ");
			}
			System.out.println();
		}

	}
}
