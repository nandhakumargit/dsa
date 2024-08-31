package com.basic.linkedlist;

public class DLLTest {
	public static void main(String[] args) {
		DLL ddl = new DLL();
		System.out.println(ddl.isEmpty());
		ddl.insert(10);
		ddl.insert(20);
		ddl.insertFirst(50);
		ddl.insertPosition(70,4);
		ddl.insertPosition(80,4);
		ddl.print();
		ddl.printReverse();
		ddl.deletePosition(2);
		//ddl.deleteLast();
		System.out.println("----------------------------");
		ddl.print();
		ddl.printReverse();
	}
}
