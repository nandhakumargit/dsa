package com.basic.array;

public class JaggedArray {
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
		

		System.out.println("\n--------------------");
		int max = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if (max < array[row].length)
					max = array[row].length;
			}
		}

		int temp[][] = new int[max][max];

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				temp[col][row] = array[row][col];
			}
		}
		for (int row = 0; row < temp.length; row++) {
			for (int col = 0; col < temp[row].length; col++) {
				System.out.print(temp[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
		}
		System.out.println("\n--------------------");
		for (int row = 0; row < temp.length; row++) {
			for (int col = 0; col < temp[row].length; col++) {
				System.out.print(temp[row][col] + " ");
			}
		}

	}
}
