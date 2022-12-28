package j6_part1;

public class Armstrong {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int sum=0;
		int r;
		while (num>0) {
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
System.out.println((sum==temp)?"Armstrong":"Non Armstrong");
	}

}
