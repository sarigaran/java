package j8_p1.java;

public class circle {
int radius;
void getradius(int r) {
	this.radius=r;
}
 void area() {
	int area=radius*radius;
System.out.println(area);
}
 void perimeter() {
	 double perimeter=2*3.14*radius;
	 System.out.println(perimeter);
 }
 public static void main(String[] args) {
	circle obj=new circle();
	obj.getradius(5);
	obj.area();
	obj.perimeter();
}
}
