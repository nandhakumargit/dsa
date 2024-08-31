package com.basic.queue;

public class CircularQueue {

	int arr[];
	int rear;
	int front;

	CircularQueue() {
		this(10);
	}

	CircularQueue(int size) {
		arr = new int[size];
		rear = -1;
		front = -1;
	}

	public boolean isEmpty() {
		return rear == -1;
	}

	public boolean isFull() {
		return (rear + 1) % arr.length == front;
	}

	public void enqueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full !!");
			return;
		}

		if (front == -1)
			front = 0;

		rear = (rear + 1) % arr.length;
		arr[rear] = value;
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty !!");
			return;
		}
		System.out.println("Removed value = " + arr[front]);
		if (front == rear) {
			rear = -1;
			front = -1;
		} else {
			front = (front + 1) % arr.length;
		}

	}

	public void print() {
		if (isEmpty()) {
			System.out.println("Queue is Empty !!");
			return;
		}

		for (int i = front; i != rear; i = (i + 1) % arr.length) {
			System.out.print(arr[i] + " -> ");
		}

		if (front == rear) {
			System.out.print(arr[front] + " -> ");
		}

		if (front == rear) {
			System.out.print(arr[front] + " -> ");
		}

		System.out.println();
	}

	public void print1() {
		if (isEmpty()) {
			System.out.println("Queue is Empty !!");
			return;
		}

		if (rear < front) { // F5 -> 4R
			for (int i = front; i < arr.length; i++) {
				System.out.print(arr[i] + " -> ");
			}
			for (int i = 0; i <= rear; i++) {
				System.out.print(arr[i] + " -> ");
			}
		}

		if (rear >= front) { // F5 -> 4R
			for (int i = front; i <= rear; i++) {
				System.out.print(arr[i] + " -> ");
			}
		}

		System.out.println();
	}

}
