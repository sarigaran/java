package org.java;

public class Employe {
	public int radius;
	public double area;
	public double perimeter;
	public void red(int radius) {
		this.radius=radius;
	}
	public double area() {
		 area=3.14*radius*radius;
		return area;
	}
	public double perimeter() {
		perimeter=2*3.14*radius;
		return perimeter;
	}
public void display() {
	System.out.println("area of circle"+area);
	System.out.println("perimeter of circle"+perimeter);
}	
class exe{ 
public static void main(String[] args) {
	Employe obj=new Employe();
	obj.red(5);
	obj.area();
	obj.perimeter();
	obj.display();
	}}
}
