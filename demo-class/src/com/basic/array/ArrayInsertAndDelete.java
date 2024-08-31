package com.basic.array;

public class ArrayInsertAndDelete {

	private int array[];
	private int index;
	private static final int MAX_CAPACITY = 10;

	ArrayInsertAndDelete() {
		this(MAX_CAPACITY);
	}

	ArrayInsertAndDelete(int size) {
		this.array = new int[size];
		this.index = -1;
	}

	public int getSize() {
		return this.array.length;
	}

	public int currentIndex() {
		return index;
	}

	public boolean isFull() {
		return index == getSize() - 1;
	}

	public boolean isEmpty() {
		return index == -1;
	}

	public boolean insert(int value) {
		if (isFull())
			return false;

		this.array[++index] = value;
		return true;
	}

	public void insert(int position, int value) {
		if (isFull()) {
			System.out.println("Array is full not able to insert");
		} else if (position > this.index) {
			insert(value);
		} else {
			shiftRight(position, value);
		}
	}

	// index is -1 , postion -1 = -2
	public void shiftRight(int position, int value) {
		// index = 4 (5), 0 -> 5 op -> i = 1 (max)
		for (int i = this.index + 1; i > position; i--) {
			this.array[i] = this.array[i - 1];
		}
		this.array[position] = value;
		index++;
	}

	public void shiftLeft(int position) {
		for (int i = position; i <= this.index; i++) {
			this.array[i] = this.array[i + 1];
		}
		index--;
	}

	public boolean delete(int position) {
		if (isEmpty())
			return false;

		shiftLeft(position);

		--index;
		return true;
	}

	public boolean delete() {
		if (isEmpty())
			return false;

		--index;
		return true;
	}

	public void print() {
		if (isEmpty())
			System.out.println("Array is empty");
		else
			for (int i = 0; i <= index; i++) {
				System.out.print(" -> " + array[i]);
			}

		System.out.println();
	}

}
