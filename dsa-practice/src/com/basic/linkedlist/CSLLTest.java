package com.basic.linkedlist;

public class CSLLTest {
	public static void main(String[] args) throws InterruptedException {
		CSLL cssl = new CSLL();
		System.out.println(cssl.isEmpty());
		cssl.insert(10);
		cssl.insertFirst(20);
		cssl.insertFirst(30);
		cssl.deleteFirst();
		cssl.deleteLast();
		cssl.deleteLast();
		// cssl.getTailNext();
		// cssl.getLast();
		cssl.print();
	}
}
