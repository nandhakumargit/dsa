package com.leetcodeSolution;

public class Test {
	public static void main(String args[]) throws InterruptedException {
		final Customer c = new Customer();
		final Customer c1 = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c1.deposit(1000);
			}
		}.start();

		new Thread() {
			public void run() {
				c1.deposit(3000);
			}
		}.start();

		new Thread() {
			public void run() {
				c1.deposit(3000);
			}
		}.start();

	}
}
