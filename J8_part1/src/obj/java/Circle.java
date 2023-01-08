package obj.java;

public class Circle {

		 int r=10;
		public double area(){	
			double area=r*r;
			return area;
		}
		public double perimeter() {	
			double quo=2*3.14*r;
			return quo;
		}
		
		public class example{
			public static void main(String[] args) {		
			Circle obj=new Circle();
			System.out.println(obj.area());
			System.out.println(obj.perimeter());
				}
			}

}


