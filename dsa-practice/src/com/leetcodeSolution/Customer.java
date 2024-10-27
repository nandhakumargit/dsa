package com.leetcodeSolution;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				Thread.currentThread().sleep(10000);
				wait();

				withdraw(amount);

				this.amount -= amount;
				System.out.println("withdraw completed...");
				System.exit(1);

			} catch (Exception e) {
			}
		}

	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}
