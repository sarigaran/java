package j6_part2;
import java.util.*;
public class Script {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
	    int i=1;
		while (i<=num) {
			System.out.println(i);
			sum=sum+i;
			i++;
		}
		System.out.println("total number is "+sum);
		int rev=0;
		while(sum!=0)
		{
			int rem=sum%10;
			rev=rev*10+rem;
			sum=sum/10;
		}	
		System.out.println("reverse number  "+rev);
		}
}
