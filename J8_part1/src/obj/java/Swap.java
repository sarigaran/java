package obj.java;
import java.util.Scanner;
public class Swap {
	int a;
	int b;int temp;
public void gnumber() {

	Scanner sc=new Scanner(System.in);               
	System.out.print("Enter the first number: ");  
	a = sc.nextInt();  
	System.out.print("Enter the second number: ");  
	b = sc.nextInt();
}
public void swapnumber() {
	temp=a;
	a=b;
	b=temp;
	System.out.println("After swapping: "+ a +" "+b);
	
}
	public static void main(String[] args) {
		Swap obj=new Swap();
		obj.gnumber();
		obj.swapnumber();


	}

}
