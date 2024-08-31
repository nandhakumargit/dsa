package com.basic.array;

public class ArrayInsertAndDeleteTest {
	public static void main(String[] args) {
		ArrayInsertAndDelete obj = new ArrayInsertAndDelete(50);
		/*
		 * obj.print(); System.out.println("isEmpty = " + obj.isEmpty());
		 * System.out.println("isFull = " + obj.isFull());
		 * System.out.println(obj.getSize()); System.out.println(obj.currentIndex());
		 * System.out.println(obj.insert(10)); System.out.println(obj.getSize());
		 * System.out.println(obj.currentIndex()); System.out.println(obj.insert(20));
		 * System.out.println(obj.insert(30)); System.out.println(obj.insert(40));
		 * System.out.println(obj.insert(50)); obj.print(); obj.delete(); obj.delete();
		 * obj.delete(); obj.delete(); obj.print(); System.out.println(obj.insert(50));
		 * obj.print(); obj.delete(); obj.delete(); obj.print();
		 * System.out.println("isFull = " + obj.isFull());
		 * System.out.println(obj.currentIndex());
		 */

		for (int i = 0; i < 5; i++) {
			obj.insert(i + 1);
		}

		obj.print();
		obj.insert(0, 50);
		obj.insert(0, 10);
		obj.delete(2);
		obj.insert(2, 100);
		obj.insert(20, 20);
		obj.print();

	}
}
