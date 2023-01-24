package org.java;

public class Bank {

		public double balance=5000;
		public double interest=0.5;

		public void deposit(double amount)
		{
			balance = balance + amount;
			System.out.println("deposite : "+balance);
		}
	
		public void withdraw(double amount)
		{
			balance = balance - amount;
			System.out.println("withdraw : "+balance);
		}
		public void interest()
		{
			balance = balance + balance * interest;
			System.out.println("intrest : "+balance);
		}
public static void main(String[] args) {
	Bank obj=new Bank();
	obj.deposit(+500);
	obj.withdraw(1000);
	obj.interest();
}}


