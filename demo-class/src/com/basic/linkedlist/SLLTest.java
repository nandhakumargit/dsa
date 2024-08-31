package com.basic.linkedlist;

public class SLLTest {
	public static void main(String[] args) {
		SLL ssl = new SLL();
		System.out.println(ssl.isEmpty());

		ssl.insertIndex(50, 5);
		ssl.insertLast(10);
		ssl.insertFirst(20);
		ssl.print();
		ssl.print();
		ssl.insertIndex(30, 10);
		ssl.insertIndex(40, 1);
		ssl.print();
		ssl.insertIndex(60, 5);
		ssl.insertIndex(70, 2);
		ssl.insertIndex(80, 1);
		ssl.getFirst();
		ssl.getLast();
		ssl.print();
		ssl.deleteLast();
		ssl.print();
		ssl.deleteFirst();
		ssl.print();
		ssl.deleteLast();
		ssl.print();
		ssl.deletePosition(3);
		// ssl.deletePosition();
		ssl.print();
		ssl.deleteFirst();
		ssl.deleteFirst();
		ssl.deleteFirst();
		ssl.deleteFirst();
		System.out.println(ssl.getSize());

		/*
		 * ssl.insert(0); ssl.insert(1); ssl.insert(2);
		 * System.out.println(ssl.isEmpty()); ssl.print(); ssl.getFirst();
		 * ssl.getLast();
		 */
	}
}
