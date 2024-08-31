package com.basic.linkedlist;

import java.util.Arrays;

public class ArrayListImplementation<T> {

	private int size;
	private static int capacity = 10;
	private T[] arrayList;

	ArrayListImplementation() {
		this(capacity);
	}

	ArrayListImplementation(int capacity) {
		this.capacity = capacity;
		this.arrayList = (T[]) new Object[capacity];
		this.size = -1;
	}

	public T get(int index) {
		if (index > size)
			return null;
		else {
			return arrayList[index];
		}
	}

	public int size() {
		return size + 1;
	}

	public int getCapacity() {
		return capacity;
	}

	public void insert(T data) {

		if (size() >= capacity) {
			createNewArray();
		}
		arrayList[++size] = data;

	}

	public T remove(int index) {
		T value = null;
		if (size < 0) {
			System.out.println("Array List Is Empty!!");
		} else {
			value = arrayList[index];
			for (int i = index; i < size(); i++) {
				arrayList[i] = arrayList[i + 1];
			}
			size--;
		}
		return value;
	}

	private void createNewArray() {
		int loadFactor = capacity * 1;
		capacity = capacity + loadFactor;
		arrayList = Arrays.copyOf(arrayList, capacity);

		/*
		 * int newArray[] = new int[capacity]; for(int i=0;i<arrayList.length;i++) {
		 * newArray[i] = arrayList[i]; } arrayList = newArray;
		 */

	}

	public void print() {
		if (size <= -1) {
			System.out.println("Empty List!!");
		} else {
			for (int i = 0; i < size(); i++) {
				System.out.print(" -> " + arrayList[i]);
			}
			System.out.println();
		}
	}

}
