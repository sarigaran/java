package example.java;
import java.util.Scanner;
public class dublicate {
	int num;
	int rem=0;
	int sum=0;
	
	
	public void split(){
		  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		num = sc.nextInt();  
		while(num > 0)  
		{  
		rem = num % 10;  
		sum = sum + rem;  
		num = num / 10;  
		}  
		System.out.println("Sum of Digits: "+sum);  
		}  
	public static void main(String[] args) {
		dublicate dub=new dublicate();
		
		dub.split();
	}
	

}
