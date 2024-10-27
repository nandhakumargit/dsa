package com.leetcodeSolution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailFast {
	public static void main(String[] args) {

		ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);

		Iterator iterator = map.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
			map.put(6, 10);
		}

	}
}
