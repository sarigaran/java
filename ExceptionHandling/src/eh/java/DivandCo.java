package eh.java;
import java.util.*;
public class DivandCo {
public static void main(String[] args) {
	int a;
	int b;int c;
	int d;
	try {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1 number");
		a=sc.nextInt();
		System.out.println("enter the 2 number");
		b=sc.nextInt();
		c=a/b;
		d=a%b;
		System.out.println("Quotient : "+c);
		System.out.println("reminter : "+d);
	}
	catch(Exception e){
		System.out.println("error" + e);
	}
	System.out.println("the end :-");
}
}
