package org.java;

public class Test extends Bank{

	public static void main(String[] args) {
		Bank jimmysSavings = new Bank();
		jimmysSavings.withdraw(250);
		jimmysSavings.deposit(400);
		jimmysSavings.interest();
		System.out.println(jimmysSavings.getBalance());
		System.out.println("Expected: 1265.0");

	}

}
