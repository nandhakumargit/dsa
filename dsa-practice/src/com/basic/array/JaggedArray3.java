package com.basic.array;

public class JaggedArray3 {
	public static void main(String[] args) {
		int array[][] = { { 1, 2, 3, 4 }, { 5, 6, 9, 8 }, { 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		int maxCol = 0;

		for (int i = 0; i < array.length; i++) {
			if (maxCol < array[i].length) {
				maxCol = array[i].length;
			}
		}
		System.out.println("--------------------------------------");
		System.out.println(maxCol);

		int resultArray[][] = new int[maxCol][];

		for (int i = 0; i < maxCol; i++) {
			int currentCol = 0;
			for (int j = 0; j < array.length; j++) {
				if (i < array[j].length) {
					currentCol++;
				}
			}

			int index = 0;
			resultArray[i] = new int[currentCol];

			for (int j = 0; j < array.length; j++) {
				if (i < array[j].length) {
					resultArray[i][index++] = array[j][i];
				}
			}
		}

		System.out.println("----------------------------------");

		for (int i = 0; i < resultArray.length; i++) {
			for (int j = 0; j < resultArray[i].length; j++) {
				System.out.print(resultArray[i][j] + " ");
			}
			System.out.println();
		}

	}
}
