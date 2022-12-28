package org.java;

public class Bank {

		private double balance=500;
		private double interest=0.5;

		public void deposit(double amount)
		{
			balance = balance + amount;
		}

		public void withdraw(double amount)
		{
			balance = balance - amount;
		}

		public void interest()
		{
			balance = balance + balance * interest;
		}

		public double getBalance()
		{
			return balance;
		}

	}


