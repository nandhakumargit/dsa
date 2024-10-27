package com.leetcodeSolution;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(100.0);

		// Creating threads for deposit and withdrawal
		Thread depositThread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				account.deposit(20.0);
				try {
					Thread.sleep(100); // Simulate time taken for deposits
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});

		Thread withdrawThread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					account.withdraw(200.0);
					Thread.sleep(150); // Simulate time taken for withdrawals
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});

		depositThread.start();
		withdrawThread.start();

		try {
			depositThread.join();
			withdrawThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final Balance: " + account.getBalance());
	}
}

class BankAccount {
	private double balance;
	private final ReentrantLock lock = new ReentrantLock();
	private final Condition sufficientFundsCondition = lock.newCondition();
	private final Condition sufficientFundsCondition1 = lock.newCondition();

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		lock.lock(); // Acquire the lock
		try {
			balance += amount;
			System.out.println("Deposited: " + amount + ", New Balance: " + balance);
			sufficientFundsCondition.signalAll(); // Notify waiting threads
		} finally {
			lock.unlock(); // Always unlock in a finally block
		}
	}

	public void withdraw(double amount) throws InterruptedException {
		lock.lock(); // Acquire the lock
		try {
			while (balance < amount) {
				System.out.println("Insufficient funds for withdrawal: " + amount + ", Current Balance: " + balance);
				sufficientFundsCondition.await(); // Wait until enough funds are available
			}
			balance -= amount;
			System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
		} finally {
			lock.unlock(); // Always unlock in a finally block
		}
	}

	public double getBalance() {
		return balance;
	}
}