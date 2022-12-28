package org.java;

import java.util.Scanner;

public class Employe {
String empname;
int empid;
float Salary;
public void assign() {
	this.empid=123;
	this.empname="hari";
	this.Salary=2000;
}
public void print() {
	System.out.println("Employee id = "+empid);

	System.out.println("Employee name = "+empname);

	System.out.println("Employee salary = "+Salary);
}
	public static void main(String[] args) {
		Employe ee=new Employe();
		ee.assign();
		ee.print();
		

	}

}
