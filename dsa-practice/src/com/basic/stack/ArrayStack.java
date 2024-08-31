package com.basic.stack;

public class ArrayStack {
	int arr[];
	int currentIndex;

	ArrayStack() {
		this(10);
	}

	ArrayStack(int size) {
		arr = new int[size];
		currentIndex = -1;
	}

	public boolean isEmpty() {
		return currentIndex == -1;
	}

	public boolean isFull() {
		return arr.length - 1 == currentIndex;
	}

	public void peek() {
		if (isEmpty())
			System.out.println("Stack is Empry!!");

		System.out.println(arr[currentIndex]);
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!!");
			return -1;
		}

		int temp = arr[currentIndex];
		--currentIndex;
		return temp;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is full !!");
			return;
		}
		arr[++currentIndex] = value;
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("Stack is Empty !!");
			return;
		}

		for (int i = currentIndex; i >= 0; i--) {
			System.out.print(arr[i] + " -> ");
		}
		System.out.println();
	}

}
