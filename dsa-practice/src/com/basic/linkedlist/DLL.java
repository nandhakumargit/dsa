package com.basic.linkedlist;

public class DLL {

	private Node head;
	private Node tail;
	int size;

	private class Node {
		private int data;
		private Node next;
		private Node previous;

		Node(int data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insert(int data) {
		Node node = new Node(data);
		if (isEmpty())
			head = tail = node;
		else {
			node.previous = tail;
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public void insertLast(int data) {
		insert(data);
	}

	public void insertPosition(int data, int position) {
		if (position == 1)
			insertFirst(data);
		else if (position > size)
			insertLast(data);
		else {
			Node previous = moveRight(position);
			Node node = new Node(data);
			node.previous = previous;
			node.next = previous.next;
			previous.next.previous = node;
			previous.next = node;

		}
	}

	public Node moveRight(int position) {
		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void insertFirst(int data) {
		if (isEmpty())
			insert(data);
		else {
			Node node = new Node(data);
			node.next = head;
			head.previous = node;
			head = node;
			size++;
		}
	}

	public void deleteFirst() {
		if (isEmpty())
			System.out.println("Empty List !!");
		else {
			head = head.next;
			head.previous = null;
			size--;
		}
	}

	public void deleteLast() {
		if (isEmpty())
			System.out.println("Empty List !!");
		else {
			tail = tail.previous;
			tail.next = null;
			size--;
		}
	}

	public void deletePosition(int position) {
		if (isEmpty())
			System.out.println("Empty List !!");
		else if (position == 1) {
			deleteFirst();
		} else {
			Node previous = moveRight(position);
			previous.next = previous.next.next; // 5 -> <- 10 -> <- 15
			previous.next.previous = previous;
		}

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(" -> " + temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public void printReverse() {
		Node temp = tail;
		while (temp != null) {
			System.out.print(" -> " + temp.data);
			temp = temp.previous;
		}
		System.out.println();
	}

}
