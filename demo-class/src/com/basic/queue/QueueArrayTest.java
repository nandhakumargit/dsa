package com.basic.queue;

public class QueueArrayTest {
	public static void main(String[] args) {
		QueueArray queue = new QueueArray(5);
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		queue.print();
		queue.dequeue();
		queue.print();
		queue.dequeue();
		queue.dequeue();

		queue.dequeue();
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		System.out.println("--------------------------------");
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.print();
		queue.dequeue();
		queue.enqueue(10);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(10);
		queue.print();
	}
}
