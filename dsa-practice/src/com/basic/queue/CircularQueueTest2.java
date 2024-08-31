package com.basic.queue;

public class CircularQueueTest2 {
	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(8);
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());

		queue.enqueue(10);
		queue.print1();
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		queue.print1();

		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		queue.dequeue();
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		System.out.println();
		queue.enqueue(90);
		System.out.println(queue.rear);
		System.out.println(queue.front);
		queue.print1();
	}
}
