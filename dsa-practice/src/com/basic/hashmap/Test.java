package com.basic.hashmap;

public class Test {

	public int hashCode() {
		return 43;
	}

	public static void main(String[] args) {

		Test hm = new Test();
		hm.put(new Test(), "1");
		hm.put(new Test(), "2");
		hm.put(new Test(), "3");
		hm.put(new Test(), "4");
		System.out.println(hm.get(new MyKey()));
	}
}
