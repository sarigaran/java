package j8_p1;
public class student {
	 public String name;
	 public int mark1;
	 public int mark2;
	 public int mark3;
	 public int mark4;
	 public int mark5;
	 public int total;
	 public double avg;
	 public void gmark(String n,int n1,int n2,int n3,int n4,int n5) {
		name=n;
		mark1=n1;
		mark2=n2;
		mark3=n3;
		mark4=n4;
		mark5=n5;
	 } 
	 public int totalmark() {
		  total=mark1+mark2+mark3+mark4+mark5;
		return total;
	 }
	 public double avgmark() {
		avg=total/55;
		 return avg;
	 }
	 private void display() {
		System.out.println("total mark is"+total);
		System.out.println("average mark is "+avg);
	}
		 public static void main(String[] args) {
	 
			// TODO Auto-generated method stub
	student obj=new student();
	obj.gmark("hari", 50, 60, 70, 80, 90);
	obj.totalmark();
	obj.avgmark();
	obj.display();
		}
	}
