package com.basic.stack;

public class ArrayStackTest {
	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(5);
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.print();
		stack.peek();
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
	}
}
