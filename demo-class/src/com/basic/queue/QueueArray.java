package com.basic.queue;

public class QueueArray {

	int arr[];
	int rear;
	int front;

	QueueArray() {
		this(10);
	}

	QueueArray(int size) {
		arr = new int[size];
		rear = -1;
		front = 0;
	}

	public boolean isEmpty() {
		return rear == -1;
	}

	public boolean isFull() {
		return rear == arr.length - 1;
	}

	public void enqueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full !!");
			return;
		}
		arr[++rear] = value;
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty !!");
			return;
		}
		System.out.println("Removed value = " + arr[front]);
		front++;
		if (front > rear) {
			rear = -1;
			front = 0;
		}

	}

	public void print() {
		if (isEmpty()) {
			System.out.println("Queue is Empty !!");
			return;
		}
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " -> ");
		}
		System.out.println();
	}

}
