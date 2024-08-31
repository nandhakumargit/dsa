package com.basic.linkedlist;

public class SLLReverseLinkedList {
	SLL tail;

	public static void reverseList(SLL list) {
		SLL head = list;

		System.out.println(head);
	}

	public static void main(String[] args) {
		SLL ssl = new SLL();
		ssl.insert(10);
		ssl.insert(20);
		ssl.insert(30);
		ssl.insert(40);
		ssl.insert(50);
		ssl.insert(60);
		ssl.print();
		reverseList(ssl);
	}
}
