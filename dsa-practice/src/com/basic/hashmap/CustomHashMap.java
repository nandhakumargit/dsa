package com.basic.hashmap;

import java.util.LinkedList;

public class CustomHashMap<K, V> {
	private static class Entry<K, V> {
		K key;
		V value;

		Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private int size;
	private int capacity;
	private static final float LOAD_FACTOR = 0.75f;
	private LinkedList<Entry<K, V>>[] bucket;

	CustomHashMap(int capacity) {
		this.capacity = capacity;
		this.bucket = new LinkedList[capacity];
		for (int i = 0; i < capacity; i++) {
			bucket[i] = new LinkedList<>();
		}
		this.size = 0;
	}

	private int hash(K key) {
		return (Integer) key % capacity;
	}

	private void resize() {

		int newCapacity = capacity * 2;
		LinkedList<Entry<K, V>>[] newBucket = new LinkedList[newCapacity];

		for (int i = 0; i < newCapacity; i++) {
			newBucket[i] = new LinkedList<>();
		}

		for (LinkedList<Entry<K, V>> eachEntity : bucket) {
			for (Entry<K, V> entry : eachEntity) {
				int newHash = entry.key.hashCode() % newCapacity;
				newBucket[newHash].add(entry);
			}
		}

		this.bucket = newBucket;
		this.capacity = newCapacity;
	}

	public void put(K key, V value) {

		if (size / capacity > LOAD_FACTOR) {
			resize();
		}

		int index = hash(key);
		LinkedList<Entry<K, V>> bucket = this.bucket[index];

		for (Entry<K, V> entry : bucket) {
			if (entry.key.equals(key)) {
				entry.value = value;
				return;
			}
		}

		bucket.add(new Entry<>(key, value));
		size++;
	}

	public V get(K key) {

		int index = hash(key);
		LinkedList<Entry<K, V>> bucket = this.bucket[index];

		for (Entry<K, V> entry : bucket) {
			if (entry.key.equals(key)) {
				return entry.value;
			}
		}

		return null;
	}

	public void remove(K key) {

		int index = hash(key);
		LinkedList<Entry<K, V>> bucket = this.bucket[index];

		for (Entry<K, V> entry : bucket) {
			if (entry.key.equals(key)) {
				bucket.remove(entry);
				size--;
			}
		}
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("{");

		for (LinkedList<Entry<K, V>> bucket : this.bucket) {
			for (Entry<K, V> entry : bucket) {
				sb.append(entry.key).append(" = ").append(entry.value).append(",");
			}
		}

		sb.append("}");
		return sb.toString();

	}

	public void print() {
		int count = 0;
		for (LinkedList<Entry<K, V>> bucket : this.bucket) {
			System.out.println();
			System.out.println("Bucket = " + (count++));
			for (Entry<K, V> entry : bucket) {
				System.out.println(entry.key + " = " + entry.value);
			}
		}
	}

}
