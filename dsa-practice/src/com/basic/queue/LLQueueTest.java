package com.basic.queue;

public class LLQueueTest {
	public static void main(String[] args) {
		LLQueue queue = new LLQueue();
		System.out.println(queue.isEmpty());
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.print();
		queue.dequeue();
		queue.print();
		queue.dequeue();
		queue.print();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
	}
}
