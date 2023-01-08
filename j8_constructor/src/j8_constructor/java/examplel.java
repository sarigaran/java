package j8_constructor.java;

public class examplel {

	public static void main(String[] args) {
	int sum=0,count=0;
	int i;
	for(i=0;i<=500;i++)
	{
		
		int d1=i%10;
		int rv=i/10;
		int d2=rv%10;
		int d3=rv/10;
		sum=d1+d2+d3;
		if(i>10) {
			if((d1==d2)||(d1==d3)||(d2==d3)) {
			
				if (sum <=5) {
					System.out.println(i+" ");
					count++;
					
				}
			}
		}
	}
	System.out.println("total"+count);
	}

}
