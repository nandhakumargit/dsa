package com.basic.stack;

public class LLStack {

	Node head;

	private class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void push(int value) { // 10 -> 5 -> null
		Node node = new Node(value);
		node.next = head;
		head = node;
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("Stack Is Empty !!");
		} else
			System.out.println(head.value);
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack Is Empty !!");
			return;
		}
		System.out.println(head.value);
		head = head.next;
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("Stack is Empty !!");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ->");
			temp = temp.next;
		}
		System.out.println();
	}

}
