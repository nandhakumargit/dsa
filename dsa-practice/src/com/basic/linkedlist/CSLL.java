package com.basic.linkedlist;

public class CSLL {
	Node head;
	Node tail;
	int size;

	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}

	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insert(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			head = tail = node;
		} else {
			tail.next = node; // Make Reference
			tail = node; // Move tail to current node
		}

		tail.next = head;
		size++;
	}

	public void insertLast(int data) {
		insert(data);
	}

	public void insertFirst(int data) {
		if (isEmpty()) {
			insert(data);
		} else {
			Node node = new Node(data);
			node.next = head;
			head = node;
			tail.next = head;
			size++;
		}
	}

	public void insertIndex(int data, int position) {
		if (isEmpty()) {
			insert(data);
		} else {
			if (position > size)
				insert(data);
			else if (position == 1) {
				insertFirst(data);
			} else {
				Node temp = head;
				for (int i = 1; i < position - 1; i++) {
					temp = temp.next;
				}
				Node node = new Node(data);
				node.next = temp.next;
				temp.next = node;
				size++;
			}
		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("Empty List");
		} else if (head.next == head) {
			deleteFirst();
		} else {
			Node temp = head;
			Node previous = head;
			while (temp.next != head) {
				previous = temp;
				temp = temp.next;
			}
			previous.next = head;
			tail = previous;
			size--;
		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("Empty List");
		}
		if (head.next == head) {
			head = tail = null;
		} else {
			head = head.next;
			tail.next = head;
			size--;
		}
	}

	public void deletePosition(int position) {

		if (isEmpty()) {
			System.out.println("Empty List");
		} else if (head.next == null) {
			deleteFirst();
		} else {
			if (position >= size)
				deleteLast();
			else if (position == 1) {
				deleteFirst();
			} else {
				Node temp = head;
				for (int i = 1; i < position - 1; i++) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
				size--;
			}
		}

	}

	public void getFirst() {
		if (isEmpty()) {
			System.out.println("List Is Empty");
		} else {
			System.out.println("Head -> " + head.data);
		}
	}

	public void getLast() {
		if (isEmpty()) {
			System.out.println("List Is Empty");
		} else {
			System.out.println("Tail -> " + tail.data);
		}
	}

	public void print() throws InterruptedException {
		Node temp = head;

		if (isEmpty()) {
			System.out.println("Empty List!!");
			return;
		}
		do {
			System.out.print("-> " + temp.data);
			temp = temp.next;
		} while (temp != head);
	}

	public void getTailNext() {
		System.out.println(tail.next.data);
	}

	public int getSize() {
		return size;
	}

}
