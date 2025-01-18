package com.basic.hashmap;

public class CustomHashMapTest {
	public static void main(String[] args) {

		CustomHashMap<Integer, String> map = new CustomHashMap<>(16);

		map.put(5, "TEST");
		map.put(3, "NAGA");
		map.put(1, "NANDHA");
		map.put(2, "KAVIN");
		map.put(30, "NAGA");
		map.put(4, "HARI");
		map.put(16, "HARI");
		map.put(1, "KUMAR");

		map.put(32, "STG");

		System.out.println(map);
		map.remove(30);
		System.out.println(map);
		System.out.println(map.get(2));

		System.out.println("--------------------------------------------");

		map.print();

	}
}
