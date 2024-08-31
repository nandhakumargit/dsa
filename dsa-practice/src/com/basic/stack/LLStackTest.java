package com.basic.stack;

public class LLStackTest {
	public static void main(String[] args) {
		LLStack stack = new LLStack();
		System.out.println(stack.isEmpty());
		stack.pop();
		stack.isEmpty();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.isEmpty());
		stack.print();
		stack.peek();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.print();
	}
}
