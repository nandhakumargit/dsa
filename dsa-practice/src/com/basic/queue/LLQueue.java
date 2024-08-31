package com.basic.queue;

public class LLQueue {
	Node head;
	Node tail;

	class Node {
		private int value;
		private Node next;

		public Node(int value) {
			super();
			this.value = value;
		}

	}

	public boolean isEmpty() {
		return head == null;
	}

	public void enqueue(int value) {

		Node node = new Node(value);

		if (head == null)
			head = tail = node;
		else {
			tail.next = node;
			tail = node;
		}
	}

	public void dequeue() {

		if (isEmpty()) {
			System.out.println("Queue is Empty !!");
		} else {
			head = head.next;
		}
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("Queue is Empty !!");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

}
