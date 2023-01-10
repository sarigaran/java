package j8_p1.java;

public class circle {
int radius;
void getradius(int r) {
	this.radius=r;
}
 int area() {
	int area=radius*radius;
return area;
}
  double perimeter() {
	 double perimeter=2*3.14*radius;
	 return perimeter;
 }
 public static void main(String[] args) {
	circle obj=new circle();
	obj.getradius(5);
	obj.area();
	obj.perimeter();
}
}
