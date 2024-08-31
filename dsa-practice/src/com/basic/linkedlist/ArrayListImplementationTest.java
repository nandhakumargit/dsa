package com.basic.linkedlist;

public class ArrayListImplementationTest {
	public static void main(String[] args) {
		ArrayListImplementation<Integer> list = new ArrayListImplementation<>(3);

		System.out.println("size = " + list.size());
		System.out.println("Capacity = " + list.getCapacity());
		list.insert(10);
		list.insert(20);
		list.insert(30);
		System.out.println("size = " + list.size());
		System.out.println("Capacity = " + list.getCapacity());
		list.print();
		list.insert(40);
		list.print();
		list.remove(0);
		list.print();
		System.out.println("Capacity = " + list.getCapacity());
	}
}
