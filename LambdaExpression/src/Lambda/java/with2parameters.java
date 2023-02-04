package Lambda.java;

import java.util.Scanner;

interface calculate{
   int find(int n1,int n2);	
};

public class with2parameters {
	
	public static void main(String[] args) {
		calculate obj=(n1,n2)->{
			return n1*n2;
		};
		calculate obj2=(n1,n2)->{ 
			
			return n1+n2;
		};
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("product : "+obj.find(a, b));
		System.out.println("sum : "+obj2.find(a, b));
		sc.close();
	}

}
